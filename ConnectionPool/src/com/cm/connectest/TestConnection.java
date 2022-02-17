package com.cm.connectest;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) throws Exception {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();


        for (int i = 0; i < 10; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            System.out.println(connection);

        }




     /*   try {
            comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");

            comboPooledDataSource.setJdbcUrl("jdbc:mysql:///product");

            comboPooledDataSource.setUser("root");

            comboPooledDataSource.setPassword("1234");

            try {
                Connection connection = comboPooledDataSource.getConnection();
                System.out.println(connection);

            } catch (SQLException e) {
                e.printStackTrace();
            }




        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }*/
    }
}
