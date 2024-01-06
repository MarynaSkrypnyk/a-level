package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    public static Connection getConnection() throws RuntimeException {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","Mari44ka");
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
    public static SessionFactory sessionFactory;

    static  {
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
    }
    static Session getSession() {
        return sessionFactory.openSession();
    }

}

