package org.example;

import java.util.List;

public class AnimalServes {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        JDBCDao jdbcDao = new JDBCDao();

        Animal animal = new Animal(2l, "Bird", "Bird");
        jdbcDao.save(animal);
        animal.setFoodOfAnimal("Cat");
        jdbcDao.update(animal);
        jdbcDao.delete(animal.getId());

        Animal animal1 = jdbcDao.get(1L);
        System.out.println(animal1);

        List<Animal> animalList9 =  jdbcDao.getAll();
        for (Animal animal9: animalList9)
        System.out.println(animal9);


//        HibernateDao hibernateDao = new HibernateDao();
//        Animal animal = new Animal(1L, "Cat", "Cat");
//        hibernateDao.save(animal);
//        animal.setFoodOfAnimal("Cat");
//        hibernateDao.update(animal);
//        hibernateDao.delete(animal.getId());
//
//        Animal animal5 = hibernateDao.get(3L);
//        System.out.println(animal5);
//
//        List<Animal> animalList6 =  hibernateDao.getAll();
//        for (Animal animal2: animalList6)
//        System.out.println(animal2);

    }
}
