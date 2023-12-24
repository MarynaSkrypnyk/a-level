package src.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    public static Connection getConnection() throws RuntimeException {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/a-level");
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
}