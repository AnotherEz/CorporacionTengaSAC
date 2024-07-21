package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    private String url= "jdbc:mysql://localhost:3306/sistema_registro_notas";
    private String usuario= "root";
    private String contraseña= "reset123";
    private static String TokenApi="c7a9d544149df08bbb59706f2057dd3b5efac6ffa7f58c6401e8e9a08b004b77";
    
    public DataBase(String url, String usuario, String contraseña) {
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
        
    }

    public ResultSet ejecutarConsulta(String consulta) {
        ResultSet resultado = null;
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement declaracion = conexion.createStatement();
            resultado = declaracion.executeQuery(consulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static void main(String[] args) {
        DataBase bd = new DataBase("jdbc:tu_url", "usuario", "contraseña");
        String consulta = "SELECT * FROM tu_tabla";
        ResultSet rs = bd.ejecutarConsulta(consulta);
        
        try {
            while (rs != null && rs.next()) {
                System.out.println("Columna 1: " + rs.getString(1));
                // Obtén y muestra más columnas según sea necesario
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     

}