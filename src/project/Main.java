package project;

import java.sql.Connection;

public class Main {
    
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();
            DAO busca = new DAO();
            busca.select();
        } finally {
            if (conn != null) {
                    ConnectionFactory.closeConnection();
            }
        }
    }
}