package src.jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try {
            Statement statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String query = """
                insert into contact
                (contact, contact_type)
                VALUES (?, ?)
                """;

        String allContact = """
               select * from contact;
               """;
        addNewContact(connection, query,"Hide","Hide");
        addNewContact(connection, query,"Java","Java");
        selectAllContact(connection, allContact);
    }

    private static void addNewContact(Connection connection, String query, String contact, String contact_type) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, contact);
        preparedStatement.setString(2, contact_type);
        preparedStatement.executeUpdate();
    }

    private static void selectAllContact(Connection connection, String allContact) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(allContact);
        ResultSet resultList = preparedStatement.executeQuery();
        while (resultList.next()) {
            System.out.println(resultList.getString("contact"));
            System.out.println(resultList.getString("contact_type"));
            System.out.println("--------");
        }
    }
}