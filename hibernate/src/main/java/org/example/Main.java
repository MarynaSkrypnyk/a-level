package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = Connection.getConfiguration();
//       create(configuration);
//        update(configuration);
//        delete(configuration);
//        findForId(configuration);
        createNewOrder(configuration);

    }

    public static void create(Configuration configuration) {
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            User user = User.builder()
                    .firstname("Drew")
                    .lastname("Drew")
                    .build();
            session.save(user);
            session.getTransaction().commit();
            session.close();
        }
    }

    public static void update(Configuration configuration) {
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session sessionUpdate = sessionFactory.openSession();
            Transaction update = sessionUpdate.beginTransaction();

            User userSecond = sessionUpdate.find(User.class, 1L);
            userSecond.setFirstname("Ben");
            sessionUpdate.update(userSecond);

            update.commit();
            sessionUpdate.close();
        }
    }

    public static void delete(Configuration configuration) {
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session sessionDelete = sessionFactory.openSession();
            Transaction deleteTransaction = sessionDelete.beginTransaction();
            User userThird = sessionDelete.find(User.class, 3L);
            sessionDelete.delete(userThird);

            deleteTransaction.commit();
            sessionDelete.close();
        }
    }

    public static void findForId(Configuration configuration) {
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session sessionFind = sessionFactory.openSession();
            Transaction update = sessionFind.beginTransaction();
            User userFour = sessionFind.find(User.class, 1L);
            System.out.println(userFour);

            update.commit();
            sessionFind.close();
        }
    }

    private static void createNewOrder(Configuration configuration) {
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            User userFirst = session.find(Booking.class, 1L).getUser();
            System.out.println(userFirst);

            Booking firstBooking = new Booking();
            firstBooking.setBookingText("Skirt");
            Booking secondBooking = new Booking();
            secondBooking.setBookingText("Socks");

            User user =  new User();
            user.setFirstname("Ann");
            user.setLastname("Ann");
            user.getBookings().add(firstBooking);
            user.getBookings().add(secondBooking);


            session.save(firstBooking);
            session.save(secondBooking);
            session.save(user);

            session.close();
        }
    }
}

