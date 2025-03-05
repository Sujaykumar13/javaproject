package org.xworks.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update1 {

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
            String sqlQuery="update myplayerinfo set playername='kl' where birthdate='1992-04-16'";
            int result = statement.executeUpdate(sqlQuery);
            System.out.println(result);

            String sqlQuery1="update myplayerinfo set matches=130 where playername='suresh' ";
            int result1 = statement.executeUpdate(sqlQuery1);
            System.out.println(result1);
            //statement.executeQuery(sqlQuery1); we not able use excuteQuery for dml

            String sqlQuery2="update myplayerinfo set  playername='klr' where  playertype='wicketkeeper' and birthplace='mangalore' ";
            int result2 = statement.executeUpdate(sqlQuery1);
            System.out.println(result2);

            String sqlQuery3="update myplayerinfo set  birthplace='mangaluru' where playername='kl' ";
            int result3 = statement.executeUpdate(sqlQuery1);
            System.out.println(result3);

            String sqlQuery4="update myplayerinfo set playertype='wicketkeeper' where playername='viratkohli' ";
            int result4 = statement.executeUpdate(sqlQuery1);
            System.out.println(result4);


            System.out.println("excuting sql query");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
