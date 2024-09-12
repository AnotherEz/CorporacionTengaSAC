package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://uc3uwppvzwhw1ov1:CKRwLOILRnfzUjdc45ic@bwdhowtlwxvgnagxg2dr-mysql.services.clever-cloud.com:3306/bwdhowtlwxvgnagxg2dr";
    private static final String USER = "uc3uwppvzwhw1ov1";
    private static final String PASSWORD = "CKRwLOILRnfzUjdc45ic";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
