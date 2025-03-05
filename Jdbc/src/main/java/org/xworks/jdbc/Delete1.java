package org.xworks.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete1 {

    public static void main(String[] args) {
        System.out.println("hello world");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("registering driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/mycricketteam";
        String userName = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("estalishing connnection from database");

            Statement statement = connection.createStatement();
            System.out.println("createing statement");
            String sqlQuery="delete from myplayerinfo where matches=120";
            int result = statement.executeUpdate(sqlQuery);
            System.out.println(result);

            String sqlQuery1="delete from myplayerinfo where  birthdate='1998-04-17' ";
            int result1 = statement.executeUpdate(sqlQuery1);
            System.out.println(result1);

            System.out.println("excuting sql query");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
