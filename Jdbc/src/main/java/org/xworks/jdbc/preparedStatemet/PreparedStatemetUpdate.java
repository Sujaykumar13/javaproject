package org.xworks.jdbc.preparedStatemet;

import com.xworks.dto.CricketTeamDto;
import com.xworks.runner.CricketTeamRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class PreparedStatemetUpdate {

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
            Connection connection=null;
            PreparedStatement prepareStatement = null;

            try {
                connection = DriverManager.getConnection(url, userName, password);
                System.out.println("estalishing connnection from database");

                String query = "update my_player_info set  birth_place=? where player_name=?";
                prepareStatement = connection.prepareStatement(query);
                System.out.println("creating statement");

                    prepareStatement.setString(1,"bengalore");
                    prepareStatement.setString(2,"KL Rahul");

                    prepareStatement.execute();


                System.out.println("executing query");


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            finally {
                System.out.println("closing costly resources");
                if(connection!=null)
                {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }

                if(prepareStatement!=null)
                {
                    try {
                        prepareStatement.close();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }


