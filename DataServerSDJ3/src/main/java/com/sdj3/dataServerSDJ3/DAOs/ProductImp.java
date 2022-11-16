package com.sdj3.dataServerSDJ3.DAOs;


import com.sdj3.dataServerSDJ3.DAOs.interfaceDao.IProductDAO;
import com.sdj3.dataServerSDJ3.Model.Animal;
import com.sdj3.dataServerSDJ3.Model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductImp implements IProductDAO {
    private static ProductImp instance;

    private ProductImp() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    public static synchronized ProductImp getInstance() throws SQLException{
        if (instance==null){
            instance= new ProductImp();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=assignment3", "postgres", "1230");
    }

    @Override
    public List<Product> allProductComingFromSameAnimal(Animal animal)  {
        try(Connection c = getConnection()) {
            PreparedStatement preparedStatement = c.prepareStatement("""
                    select p.id, p.name, p.weight
                    from product p join part_in_product pip on p.id = pip.product_id join part p2 on p2.id = pip.part_id
                    join animal a on a.id = p2.animal_id
                    where a.id=?;""");
            preparedStatement.setInt(1, animal.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Product> products = new ArrayList<>();
            while (resultSet.next()){
                Product part = new Product(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getDouble(3)
                );
                products.add(part);
            }
            return products;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
