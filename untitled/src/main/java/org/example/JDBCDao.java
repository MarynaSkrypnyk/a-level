package org.example;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.example.ConnectionManager.getSession;

public class JDBCDao implements Dao <Animal> {

    @Override
    public Animal save(Animal entity) {
        final String SAVE_SQL = "insert into animal (animal, foodOfAnimal) values (?,?)";
        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(SAVE_SQL, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, entity.getAnimal());
            statement.setString(2, entity.getFoodOfAnimal());
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                long id = resultSet.getLong("id");
                entity.setId(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entity;
    }

    @Override
    public Animal update(Animal entity) {
        final String UPDATE_SQL = "UPDATE animal set animal=?, foodOfAnimal=? WHERE id=? ";
        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(UPDATE_SQL);
            statement.setString(1,entity.getAnimal());
            statement.setString(2,entity.getFoodOfAnimal());
            statement.setLong(3,entity.getId());
            statement.executeUpdate();
            return entity;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(long id) {
        final String DELETE_SQL = "DELETE from animal where id=?";
        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(DELETE_SQL);
            statement.setLong(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        @Override
    public Animal get(long id) throws RuntimeException {
       final String GET_SQL = "SELECT id, animal, foodOfAnimal FROM animal where id=? ";
       Animal animal = new Animal();
       try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(GET_SQL);
            statement.setLong(1, id);
           ResultSet resultSet = statement.executeQuery();

           while (resultSet.next()) {
               animal.setId(resultSet.getLong("id"));
               animal.setAnimal(resultSet.getString("animal"));
               animal.setFoodOfAnimal(resultSet.getString("foodOfAnimal"));
           }
           animal.setId(id);

       } catch (SQLException e) {
            e.printStackTrace();
        }
            return animal;
        }

    @Override
    public List<Animal> getAll() {
        List <Animal> animalList = new ArrayList<>();
        final String GET_ALL_SQL = "SELECT id, animal, foodOfAnimal from animal";

        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(GET_ALL_SQL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Animal animal = new Animal();
                animal.setId(resultSet.getLong("id"));
                animal.setAnimal(resultSet.getString("animal"));
                animal.setFoodOfAnimal(resultSet.getString("foodOfAnimal"));
                animalList.add(animal);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return animalList;
    }
}