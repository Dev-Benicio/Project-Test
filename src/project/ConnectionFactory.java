package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ConnectionFactory {
    private static String URL;
    private static String USER;
    private static String PASS;
    private static Connection conn = null;
    
    public static Connection getConnection(){
        try {
            Properties prop = loadProperties("config/DataBase.properties");
            URL = prop.getProperty("db_url");
            USER = prop.getProperty("db_user");
            PASS = prop.getProperty("db_pass");
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException | IOException e) {
            System.out.println(" Mensagem erro: "+e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }
    
    private static Properties loadProperties(String filePath) throws IOException {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream(filePath)) {
            properties.load(input);
        }
        return properties;
    }
    
    public static void closeConnection(){
        try {
            if (conn != null) {
                conn.close();
                System.out.println(" Conexão fechada com sucesso!! ");
            }
        } catch (SQLException e) {
            System.out.println(" Mensagem de erro: "+e.getMessage());
            e.printStackTrace();
        }
    }
}