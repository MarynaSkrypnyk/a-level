package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.time.LocalDateTime;

import java.util.List;

public class HQLMain {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();

//        selectUsers();
//        findOrders();
        sumOrders();
    }

    private static Session getSession() {
        return sessionFactory.openSession();
    }

    public static void selectUsers() {
        try (Session session = getSession()) {
            session.beginTransaction();

            Query<Booking> selectFromBooks =
                    session.createQuery("select u from User u WHERE size (u.bookings)>5", Booking.class);
            List<Booking> list = selectFromBooks.list();
            System.out.println(selectFromBooks.list());
//            System.out.println(list);

            session.getTransaction().commit();
        }
        sessionFactory.close();
    }

    public static void findOrders() {
        try (Session session = getSession()) {
            session.beginTransaction();
            List<Booking> selectUsers = session.createQuery("select b from Booking b where (user.id = 1L) and b.bookingTime between: firstDate and: lastDate", Booking.class)
                    .setParameter("firstDate", LocalDateTime.of(2024, 1, 3, 1, 1, 1))
                    .setParameter("lastDate", LocalDateTime.of(2024, 1, 5, 1, 1, 1))
                    .list();

            System.out.println(selectUsers);

            session.getTransaction().commit();
        }
        sessionFactory.close();
    }

    public static void sumOrders() {
        try (Session session = getSession()) {
            session.beginTransaction();
            Query<Booking> selectFromBooks =
                    session.createQuery("select sum(user.id) from Booking where user.id = 2L", Booking.class);
            List<Booking> list = selectFromBooks.list();
            System.out.println(list);

            session.getTransaction().commit();
        }
        sessionFactory.close();
    }
}

