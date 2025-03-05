package org.xworks.jdbc;

import java.sql.*;

public class Fetch {

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

            String sqlQuery1="select count(*) from myplayerinfo";
            boolean result = statement.execute(sqlQuery1);
            System.out.println(result);

            //int result1 = statement.executeUpdate(sqlQuery1);we will get exception
            //System.out.println(result1);

            ResultSet result2 = statement.executeQuery(sqlQuery1);
            System.out.println(result2);//it will give fully quaified path
            //if(result2.next()) {
              //  System.out.println(result2.getNString("playername"));
           // }

            String sqlQuery2="select * from myplayerinfo";
            ResultSet result3 = statement.executeQuery(sqlQuery2);
            System.out.println(result3);
            while(result3.next()) {
                System.out.println(result3.getString("playername"));
                System.out.println(result3.getString("jerseynum"));
                System.out.println(result3.getString("playertype"));
                System.out.println(result3.getString(4));
                System.out.println(result3.getString(5));
                 }
            String sqlQuery3 = "select * from myplayerinfo where matches in (119,64) and testruns<5000 or  " +
                    "birthdate between '1997-01-01' and '1999-01-01'";
            ResultSet result4 = statement.executeQuery(sqlQuery3);
            System.out.println(result4);
            while(result4.next()) {
                System.out.println(result4.getString("playername"));
                System.out.println(result4.getString("jerseynum"));
                System.out.println(result4.getString("playertype"));
                System.out.println(result4.getString(4));
                System.out.println(result4.getString(5));
            }

            String sqlQuery4 = "select * from myplayerinfo where jerseynum  not in (64,45) and matches not in (64,54) " +
                    "and playername not in ('kl','jadeja')";
            ResultSet result5 = statement.executeQuery(sqlQuery4);
            System.out.println(result5);
            while(result5.next()) {
                System.out.println(result5.getString("playername"));
                System.out.println(result5.getString("jerseynum"));
                System.out.println(result5.getString("playertype"));
                System.out.println(result5.getString(4));
                System.out.println(result5.getString(5));
            }

            String sqlQuery5 = "select * from myplayerinfo where  playername between 'kl' and 'Kuldeep' and jerseynum > 20";
            ResultSet result6 = statement.executeQuery(sqlQuery5);
            System.out.println(result6);
            while(result6.next()) {
                System.out.println(result6.getString("playername"));
                System.out.println(result6.getString("jerseynum"));
                System.out.println(result6.getString("playertype"));
                System.out.println(result6.getString(4));
                System.out.println(result6.getString(5));
            }

            String sqlQuery6 = "select * from myplayerinfo where birthdate not between '1980-04-13' and '1999-01-01' and  " +
                    "testruns not in (54,44)";
            ResultSet result7 = statement.executeQuery(sqlQuery6);
            System.out.println(result7);
            while(result7.next()) {
                System.out.println(result7.getString("playername"));
                System.out.println(result7.getString("jerseynum"));
                System.out.println(result7.getString("playertype"));
                System.out.println(result7.getString(4));
                System.out.println(result7.getString(5));
            }

            String sqlQuery7 = "select * from myplayerinfo where birthplace like 'p%b' and testruns<4000 or playername like '%a'";
            ResultSet result8 = statement.executeQuery(sqlQuery7);
            System.out.println(result8);
            while(result8.next()) {
                System.out.println(result8.getString("playername"));
                System.out.println(result8.getString("jerseynum"));
                System.out.println(result8.getString("playertype"));
                System.out.println(result8.getString(4));
                System.out.println(result8.getString(5));
            }

            String sqlQuery8 = "select * from myplayerinfo  where playertype in ('batter','spinner') and testruns>1000  " +
                    "order by jerseynum desc";
            ResultSet result9 = statement.executeQuery(sqlQuery8);
            System.out.println(result9);
            while(result9.next()) {
                System.out.println(result9.getString("playername"));
                System.out.println(result9.getString("jerseynum"));
                System.out.println(result9.getString("playertype"));
                System.out.println(result9.getString(4));
                System.out.println(result9.getString(5));
            }

            String sqlQuery9 = "select playertype ,sum(matches) from myplayerinfo group by playertype having sum(testruns)>1000";
            ResultSet result10 = statement.executeQuery(sqlQuery9);
            System.out.println(result10);
            while(result10.next()) {

                System.out.println(result10.getString("playertype"));

            }

            String sqlQuery10 = "select playertype,avg(testruns),sum(matches) from myplayerinfo group by playertype";
            ResultSet result11 = statement.executeQuery(sqlQuery10);
            System.out.println(result11);
            while(result11.next()) {

                System.out.println(result11.getString("playertype"));

            }

            System.out.println("excuting sql query");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
