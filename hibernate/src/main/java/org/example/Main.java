package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
//        create();
//        update();
//        delete();
//        findForId();
        createNewOrder();

    }

    private static Session getSession() {
        return sessionFactory.openSession();
    }

    public static void create() {
        try (Session session = getSession()) {
            session.beginTransaction();

            User user = User.builder()
                    .firstname("Ann")
                    .lastname("Ann")
                    .build();

            session.save(user);
            session.getTransaction().commit();
        }
    sessionFactory.close();
    }


    public static void update() {
       try (Session session = getSession()) {
            session.beginTransaction();

            User userSecond = session.find(User.class, 1L);
            userSecond.setFirstname("Ben");
            session.update(userSecond);

            session.getTransaction().commit();
        }
    sessionFactory.close();
    }

    public static void delete() {
    try (Session session = getSession()) {
            session.beginTransaction();
            User userThird = session.find(User.class, 1L);
            session.delete(userThird);

            session.getTransaction().commit();
        }
    sessionFactory.close();
    }

    public static void findForId() {
        try (Session session = getSession()) {
          session.beginTransaction();

            User userFour = session.find(User.class, 3L);

            System.out.println(userFour);

            session.getTransaction().commit();
        }
    sessionFactory.close();
    }

    private static void createNewOrder() {
        try (Session session = getSession()) {
            session.beginTransaction();

            User user = session.get(User.class, 2L);

            Booking booking = Booking.builder()
                    .bookingText("Short")
                    .user(user)
                    .build();

            session.persist(booking);
         }
       sessionFactory.close();
        }
    }

