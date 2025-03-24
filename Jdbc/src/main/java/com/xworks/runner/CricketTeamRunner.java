package com.xworks.runner;

import com.xworks.dto.CricketTeamDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CricketTeamRunner {

        public static Collection<CricketTeamDto> getPlayers()
        {

            CricketTeamDto player1=new CricketTeamDto(18, "viratkohli","batter",
                    "delhi","1988-11-06",119,9012);

            CricketTeamDto player2 =new CricketTeamDto(45, "rohitsharma","batter",
                    "mumbai","1987-04-30",64,4125);

            CricketTeamDto player3 = new CricketTeamDto(64, "jaiswal", "leftbatter",
                    "up", "1999-12-28",14,1825);

            CricketTeamDto player4 = new CricketTeamDto(1, "KL Rahul", "wicketkeeper",
                    "mangalore", "1992-04-16",54,3125);

            CricketTeamDto player5 = new CricketTeamDto(77, "gill", "batter",
                    "punjab", "1999-08-11",34,2125);

            CricketTeamDto player6 = new CricketTeamDto(56, "pant", "wicketkeeper",
                    "delhi", "1997-10-04",44,2225);

            CricketTeamDto player7 = new CricketTeamDto(88, "sarfraj", "wicketkeeper",
                    "mumbai", "1997-05-17",4,312);

            CricketTeamDto player8 = new CricketTeamDto(17, "jadeja", "all rounder",
                    "saurastra", "1998-04-17",84,4125);

            CricketTeamDto player9 = new CricketTeamDto(99, "ashwin", "all rounder",
                    "chennai", "1984-06-26",114,3525);

            CricketTeamDto player10 = new CricketTeamDto(66, "sundar", "spinner",
                    "chennai", "1990-03-26",24,1125);

            CricketTeamDto player11 = new CricketTeamDto(22, "Kuldeep", "spinner",
                    "up", "1994-08-16",44,725);

            CricketTeamDto player12 = new CricketTeamDto(78, "bumrah", "bowler",
                    "baroda", "1992-05-16",64,725);

            CricketTeamDto player13 = new CricketTeamDto(33, "siraj", "bowler",
                    "punjab", "1993-02-06",44,1125);

            CricketTeamDto player14 = new CricketTeamDto(54, "prasid", "bowler",
                    "bangalore", "1992-05-26",14,425);

            CricketTeamDto player15 = new CricketTeamDto(55, "akashr", "bowler",
                    "kolkata", "1995-09-09",10,225);

            CricketTeamDto player16 = new CricketTeamDto(101, "mayank", "batting",
                    "bangalore", "1992-08-07",88,125);

            CricketTeamDto player17 = new CricketTeamDto(3, "raina", "batting",
                    "gujrat", "1982-06-07",78,245);

            CricketTeamDto player18 = new CricketTeamDto(44, "sehwag", "batting",
                    "delhi", "1980-08-12",69,425);

            CricketTeamDto player19 = new CricketTeamDto(7, "dhoni", "keeper",
                    "jharkand", "1985-07-14",99,385);

            CricketTeamDto player20 = new CricketTeamDto(10, "sachin", "batting",
                    "mumbai", "1975-08-10",102,568);


            Collection<CricketTeamDto> teamDtos = new ArrayList<>();
            teamDtos.add(player1);
            teamDtos.add(player2);
            teamDtos.add(player3);
            teamDtos.add(player4);
            teamDtos.add(player5);
            teamDtos.add(player6);
            teamDtos.add(player7);
            teamDtos.add(player8);
            teamDtos.add(player9);
            teamDtos.add(player10);
            teamDtos.add(player11);
            teamDtos.add(player12);
            teamDtos.add(player13);
            teamDtos.add(player14);
            teamDtos.add(player15);
            teamDtos.add(player16);
            teamDtos.add(player17);
            teamDtos.add(player18);
            teamDtos.add(player19);
            teamDtos.add(player20);

            System.out.println(teamDtos.size());
            return teamDtos;
        }

    }


