package com.sdj3.dataServerSDJ3.DAOs;

import com.sdj3.dataServerSDJ3.DAOs.interfaceDao.ITrayDAO;
import com.sdj3.dataServerSDJ3.Model.Tray;

import java.security.Key;
import java.sql.*;

public class TrayImp implements ITrayDAO {

private static TrayImp instance;

    public TrayImp() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    public static synchronized TrayImp getInstance() throws SQLException {
        if (instance == null){
            instance= new TrayImp();
        }
        return instance;
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=assignment3", "postgres", "1230");
    }


    @Override
    public String addNewTray(Tray tray) {
        try (Connection c = getConnection()){
            PreparedStatement preparedStatement = c.prepareStatement("insert into tray(name, max_weight) values (?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,tray.getName());
            preparedStatement.setInt(2,tray.getMax_weight());
            preparedStatement.executeUpdate();
            ResultSet key = preparedStatement.getGeneratedKeys();
            if (key.next())
           return "You add a new tray with Id: "+key.getInt(1)+ ", type: "+ key.getString(2);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
