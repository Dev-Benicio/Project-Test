package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection conn = ConnectionFactory.getConnection();

    public void select() {
        String select = "SELECT id, user, pass FROM Usuario";
        try (PreparedStatement stmt = conn.prepareStatement(select); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("\nID: " + rs.getInt("id"));
                System.out.println("User: " + rs.getString("user"));
                System.out.println("Pass: " + rs.getString("pass"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}