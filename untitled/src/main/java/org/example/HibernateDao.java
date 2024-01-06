package org.example;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import java.util.List;
import static org.example.ConnectionManager.getSession;

public class HibernateDao implements Dao <Animal> {

    @Override
    public Animal save(Animal entity) {
        try (Session session = getSession()) {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        }
        return entity;
    }

    @Override
    public Animal update(Animal entity) {
        try (Session session = getSession()) {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        }
        return entity;
    }

    @Override
    public void delete(long id) {
        try (Session session = getSession()) {
            session.beginTransaction();
            Animal nativeQuery = session.byId(Animal.class).load(id);
            session.delete(nativeQuery);

            session.getTransaction().commit();
        }
    }

    @Override
    public Animal get(long id) {
        String sql = "SELECT * from animal where id = :id";
        try (Session session = getSession()) {
            session.beginTransaction();
            NativeQuery nativeQuery = session.createNativeQuery(sql).addEntity(Animal.class);
            nativeQuery.setParameter("id",id);
            Animal animal = (Animal) nativeQuery.getSingleResult();
            session.getTransaction().commit();
            return animal;
        }
    }

    @Override
    public List<Animal> getAll() {
        String sql = "SELECT * from animal";
        try (Session session = getSession()) {
            session.beginTransaction();
            NativeQuery nativeQuery = session.createNativeQuery(sql).addEntity(Animal.class);
            List<Animal> animalList = nativeQuery.list();
            session.getTransaction().commit();
            return animalList;
        }
    }
}
