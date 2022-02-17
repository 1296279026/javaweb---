package com.cm.connectest;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection2 {

    public static void main(String[] args) throws SQLException {
        BasicDataSource basicDataSource=new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql:///product");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("1234");

        Connection connection = basicDataSource.getConnection();
        System.out.println(connection);
    }


}
