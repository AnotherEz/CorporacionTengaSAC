
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
    System.out.println("Iniciando consulta para el username: " + username);
    
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        
        System.out.println("Conexión establecida y PreparedStatement creado.");
        
        preparedStatement.setString(1, username);
        System.out.println("Query preparada: " + preparedStatement.toString());
        
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("Consulta ejecutada.");
        
        if (resultSet.next()) {
            String nombres = resultSet.getString("nombres");
            String firstLastName = resultSet.getString("firstLastName");
            String secondLastName = resultSet.getString("secondLastName");
            String nombreCompleto = nombres + " " + firstLastName + " " + secondLastName;
            System.out.println("Usuario encontrado. Nombre completo: " + nombreCompleto);
            return nombreCompleto;
        } else {
            System.out.println("No se encontró ningún usuario con el username: " + username);
            return null; // No se encontró el usuario
        }
    } catch (SQLException e) {
        System.err.println("Error SQL en la consulta:");
        e.printStackTrace();
        return null;
    } catch (Exception e) {
        System.err.println("Error inesperado en la consulta:");
        e.printStackTrace();
        return null;
    } finally {
        System.out.println("Consulta finalizada.");
    }

    }
}
