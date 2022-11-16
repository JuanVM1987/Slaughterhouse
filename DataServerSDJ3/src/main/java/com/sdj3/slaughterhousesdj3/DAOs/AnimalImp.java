package com.sdj3.slaughterhousesdj3.DAOs;


import com.google.type.DateTime;
import com.sdj3.slaughterhousesdj3.DAOs.interfaceDao.IAnimalDAO;
import com.sdj3.slaughterhousesdj3.Model.Animal;
import com.sdj3.slaughterhousesdj3.Model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalImp implements IAnimalDAO {
    private static AnimalImp instance;

    private AnimalImp() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    public static synchronized AnimalImp getInstance() throws SQLException {
        if (instance == null) {
            instance = new AnimalImp();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=assignment3", "postgres", "1230");
    }


    @Override
    public List<Animal> getAnimalFromProduct(Product product) {
        try (Connection c = getConnection()) {
            PreparedStatement preparedStatement = c.prepareStatement("""
                    select a.id, a.origen, a.weight, a.arrived_date
                    from animal a join part p on a.id = p.animal_id join part_in_product pip on p.id = pip.part_id
                    join product p2 on p2.id = pip.product_id
                    where p2.id=?;""");
            preparedStatement.setInt(1, product.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Animal> list = new ArrayList<>();
            while (resultSet.next()) {
                Animal animal = new Animal(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getDouble(3),
                        resultSet.getDate(4)
                );
                list.add(animal);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Animal> getAllAnimals() {
        try (Connection c = getConnection()) {
            PreparedStatement preparedStatement = c.prepareStatement("select * from animal;");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Animal> animalList = new ArrayList<>();
            while (resultSet.next()) {
                Animal animal = new Animal(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getDouble(3),
                        resultSet.getDate(4)
                );
                animalList.add(animal);
            }
            return animalList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Animal getAnimalById(int id) {
        try (Connection c = getConnection()) {
            PreparedStatement preparedStatement = c.prepareStatement("select * from animal where animal.id= ?;");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

               int newId=resultSet.getInt(1);
               String newOrigen= resultSet.getString(2);
               double newWeight=resultSet.getDouble(3);
               Date newDate= resultSet.getDate(4);

                return new Animal(newId,newOrigen,newWeight,newDate);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Animal RegisterAnima(Animal animal) {

    try (Connection c = getConnection()){
        PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO animal(origen, weight, arrived_date) values (?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, animal.getOrigen());
        preparedStatement.setDouble(2,animal.getWeight());
        preparedStatement.setDate(3, (Date) animal.getArrivedDate());
        preparedStatement.executeUpdate();

        ResultSet key = preparedStatement.getGeneratedKeys();
        if (key.next()){
           return new Animal(key.getInt(1), animal.getOrigen(),animal.getWeight(),animal.getArrivedDate());
        }

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    return null;

    }
}