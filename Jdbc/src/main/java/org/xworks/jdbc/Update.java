package org.xworks.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

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
            String sqlQuery="update myplayerinfo set playername='kohli' where jerseynum=18";
            boolean result1 =statement.execute(sqlQuery);
            System.out.println(result1);

            String sqlQuery1="update myplayerinfo set jerseynum=3 where playername='suresh'";
            boolean result2 =statement.execute(sqlQuery1);
            System.out.println(result2);

            String sqlQuery2="update myplayerinfo set  birthplace='mangaluru' where playername='kl'";
            boolean result3 = statement.execute(sqlQuery2);
            System.out.println(result3);

            String sqlQuery3="update myplayerinfo set matches=130 where playername='suresh'";
            boolean result4 = statement.execute(sqlQuery3);
            System.out.println(result4);

            String sqlQuery4="update myplayerinfo set  birthplace='bengaluru' where playertype='batter'";
            boolean result5 = statement.execute(sqlQuery4);
            System.out.println(result5);

            System.out.println("excuting sql query");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
