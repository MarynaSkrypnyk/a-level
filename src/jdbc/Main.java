package src.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    public static void main(String[] args) {
        try (Connection connection = ConnectionManager.getConnection()){
            Statement statement = connection.createStatement();

            String sqlQuery = """
                     insert into contact
                     (contact, contact_type)
                     VALUES ('Andy', 'Andy')
                     """;
            int i = statement.executeUpdate(sqlQuery);
            System.out.println(i);

            String allContact = """
                     select * from contact;
                     """;
            ResultSet resultList = statement.executeQuery(allContact);
            while (resultList.next()) {
                System.out.println(resultList.getString("contact"));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);

        }
    }
}
