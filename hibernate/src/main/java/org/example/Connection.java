package org.example;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public final class Connection {
    public static Configuration getConfiguration(){

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Booking.class);
        configuration.configure();

        return configuration;
    }

}
