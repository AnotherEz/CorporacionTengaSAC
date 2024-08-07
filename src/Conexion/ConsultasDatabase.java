package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;

public class ConsultasDatabase {
    public boolean authenticate(String username, String password) {
        String query = "SELECT * FROM trabajadores WHERE username = ? AND password = ?";
        
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                return true; // Usuario autenticado
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false; // Autenticación fallida
    }
    public String obtenerCargoOcupadoPorUsername(String username) {
        String query = "SELECT cargoOcupado FROM trabajadores WHERE username = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
             
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                return resultSet.getString("cargoOcupado");
            } else {
                return null; // No se encontró el usuario
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String obtenerNombreCompletoPorUsername(String username) {
        String query = "SELECT nombres, firstLastName, secondLastName FROM trabajadores WHERE username = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
             
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                String nombres = resultSet.getString("nombres");
                String firstLastName = resultSet.getString("firstLastName");
                String secondLastName = resultSet.getString("secondLastName");
                return nombres + " " + firstLastName + " " + secondLastName;
            } else {
                return null; // No se encontró el usuario
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
