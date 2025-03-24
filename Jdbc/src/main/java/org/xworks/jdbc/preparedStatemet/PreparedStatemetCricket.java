package org.xworks.jdbc.preparedStatemet;

import com.xworks.dto.CricketTeamDto;
import com.xworks.runner.CricketTeamRunner;

import java.sql.*;
import java.util.Collection;

public class PreparedStatemetCricket {

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

            String query = "insert into my_player_info (jersey_num,player_name,player_type,birth_place,birth_date,matches,test_runs) values (?,?,?,?,?,?,?)";
            prepareStatement = connection.prepareStatement(query);
            System.out.println("creating statement");

            Collection<CricketTeamDto> teamDtos = CricketTeamRunner.getPlayers();
            for (CricketTeamDto teamDto : teamDtos) {

                prepareStatement.setInt(1,teamDto.getJerrseyNum());
                prepareStatement.setString(2,teamDto.getPlayerName());
                prepareStatement.setString(3,teamDto.getPlayerType());
                prepareStatement.setString(4,teamDto.getBirthPlace());
                prepareStatement.setString(5,teamDto.getBirthDate());
                prepareStatement.setInt(6,teamDto.getMatches());
                prepareStatement.setInt(7,teamDto.getTestRuns());

                prepareStatement.execute();

            }
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
