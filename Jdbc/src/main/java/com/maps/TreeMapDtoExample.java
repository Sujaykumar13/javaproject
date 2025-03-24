package com.maps;

import com.xworks.dto.CricketOdiStatsDto;
import com.xworks.dto.CricketTeamDto;

import java.util.*;

public class TreeMapDtoExample {

        public static void main(String[] args) {

            Map<CricketTeamDto,CricketOdiStatsDto> map = new TreeMap<>();
            System.out.println("To add the values and key=====================================");
            CricketTeamDto player1 = new CricketTeamDto(18, "viratkohli","batter",
                    "delhi","1988-11-06",119,9012);
            CricketOdiStatsDto odi1=new CricketOdiStatsDto(5465,25,7,45.25);
            map.put(player1,odi1);

            CricketTeamDto player2 = new CricketTeamDto(45, "rohitsharma","batter",
                    "mumbai","1987-04-30",64,4125);
            CricketOdiStatsDto odi2=new CricketOdiStatsDto(15465,75,57,55.25);
            map.put(player2,odi2);

            CricketTeamDto player3 = new CricketTeamDto(64, "jaiswal", "leftbatter",
                    "up", "1999-12-28",14,1825);
            CricketOdiStatsDto odi3=new CricketOdiStatsDto(10465,65,27,50.25);
            map.put(player3,odi3);

            CricketTeamDto player4 = new CricketTeamDto(1, "KL Rahul", "wicketkeeper",
                    "mangalore", "1992-04-16",54,3125);
            CricketOdiStatsDto odi4=new CricketOdiStatsDto(4465,30,9,45.25);
            map.put(player4,odi4);

            CricketTeamDto player5 = new CricketTeamDto(77, "gill", "batter",
                    "punjab", "1999-08-11",34,2125);
            CricketOdiStatsDto odi5=new CricketOdiStatsDto(2565,17,5,65.45);
            map.put(player5,odi5);

            CricketTeamDto player6 = new CricketTeamDto(56, "pant", "wicketkeeper",
                    "delhi", "1997-10-04",44,2225);
            CricketOdiStatsDto odi6=new CricketOdiStatsDto(4465,20,4,35.25);
            map.put(player6,odi6);

            CricketTeamDto player7 = new CricketTeamDto(88, "sarfraj", "wicketkeeper",
                     "mumbai", "1997-05-17",4,312);
            CricketOdiStatsDto odi7=new CricketOdiStatsDto(465,1,0,25.25);
            map.put(player7,odi7);

            CricketTeamDto player8 = new CricketTeamDto(17, "jadeja", "all rounder",
                    "saurastra", "1998-04-17",84,4125);
            CricketOdiStatsDto odi8=new CricketOdiStatsDto(3465,30,2,40.25);
            map.put(player8,odi8);

            CricketTeamDto player9 = new CricketTeamDto(99, "ashwin", "all rounder",
                    "chennai", "1984-06-26",114,3525);
            CricketOdiStatsDto odi9=new CricketOdiStatsDto(2465,14,1,20.25);
            map.put(player9,odi9);

            CricketTeamDto player10 = new CricketTeamDto(66, "sundar", "spinner",
                    "chennai", "1990-03-26",24,1125);
            CricketOdiStatsDto odi10=new CricketOdiStatsDto(1246,2,0,5.25);
            map.put(player10,odi10);

            CricketTeamDto player11 = new CricketTeamDto(22, "Kuldeep", "spinner",
                    "up", "1994-08-16",44,725);
            CricketOdiStatsDto odi11=new CricketOdiStatsDto(465,0,0,12.23);
            map.put(player11,odi11);

            CricketTeamDto player12 = new CricketTeamDto(78, "bumrah", "bowler",
                    "baroda", "1992-05-16",64,725);
            CricketOdiStatsDto odi12=new CricketOdiStatsDto(365,0,0,10.25);
            map.put(player12,odi12);

            CricketTeamDto player13 = new CricketTeamDto(33, "siraj", "bowler",
                    "punjab", "1993-02-06",44,1125);
            CricketOdiStatsDto odi13=new CricketOdiStatsDto(765,1,0,7.25);
            map.put(player13,odi13);
            CricketTeamDto player14 = new CricketTeamDto(54, "prasid", "bowler",
                    "bangalore", "1992-05-26",14,425);
            CricketOdiStatsDto odi14=new CricketOdiStatsDto(165,0,0,15.25);
            map.put(player14,odi14);
            CricketTeamDto player15 = new CricketTeamDto(55, "akashr", "bowler",
                    "kolkata", "1995-09-09",10,225);
            CricketOdiStatsDto odi15=new CricketOdiStatsDto(65,0,0,2.25);
            map.put(player15,odi15);
            CricketTeamDto player16 = new CricketTeamDto(101, "mayank", "batting",
                    "bangalore", "1992-08-07",88,125);
            CricketOdiStatsDto odi16=new CricketOdiStatsDto(5461,37,5,40.25);
            map.put(player16,odi16);
            CricketTeamDto player17 = new CricketTeamDto(3, "raina", "batting",
                    "gujrat", "1982-06-07",78,245);
            CricketOdiStatsDto odi17=new CricketOdiStatsDto(6465,37,10,48.65);
            map.put(player17,odi17);
            CricketTeamDto player18 = new CricketTeamDto(44, "sehwag", "batting",
                    "delhi", "1980-08-12",69,425);
            CricketOdiStatsDto odi18=new CricketOdiStatsDto(10465,87,35,49.85);
            map.put(player18,odi18);
            CricketTeamDto player19 = new CricketTeamDto(7, "dhoni", "keeper",
                    "jharkand", "1985-07-14",99,385);
            CricketOdiStatsDto odi19=new CricketOdiStatsDto(10465,87,5,55.35);
            map.put(player19,odi19);
            CricketTeamDto player20 = new CricketTeamDto(10, "sachin", "batting",
                    "mumbai", "1975-08-10",102,568);
            CricketOdiStatsDto odi20=new CricketOdiStatsDto(18564,120,50,54.65);
            map.put(player20,odi20);

            System.out.println(map);

            System.out.println("To print the value using key=====================================");

            Set<CricketTeamDto> keys = map.keySet();

            for (CricketTeamDto key : keys) {
                System.out.println(map.get(key));
                System.out.println(key.getJerrseyNum());
                System.out.println(key.getPlayerName());
                System.out.println(key.getPlayerType());
                System.out.println(key.getBirthPlace());
                System.out.println(key.getBirthDate());
                System.out.println(key.getMatches());
                System.out.println(key.getTestRuns()+"value of odi runs"+map.get(key).getOdiRuns()+"number of fifties"+
                        map.get(key).getNoOfFifties()+ "nu of hundreds"+map.get(key).getNoOfHundreds()+"average"+map.get(key).getAverage());
                System.out.println(map.get(key).getOdiRuns());
            }
            System.out.println("print using for=========================================================");
            Set<Map.Entry<CricketTeamDto, CricketOdiStatsDto>> entry = map.entrySet();
            for (Map.Entry<CricketTeamDto, CricketOdiStatsDto> cricketTeamDtoObjectEntry : entry) {
                System.out.println(cricketTeamDtoObjectEntry.getKey().getJerrseyNum());
                System.out.println(cricketTeamDtoObjectEntry.getKey().getPlayerName());
                System.out.println(cricketTeamDtoObjectEntry.getKey().getPlayerType());
                System.out.println(cricketTeamDtoObjectEntry.getKey().getBirthPlace());
                System.out.println(cricketTeamDtoObjectEntry.getKey().getBirthDate());
                System.out.println(cricketTeamDtoObjectEntry.getKey().getMatches());
                System.out.println(cricketTeamDtoObjectEntry.getKey().getTestRuns()+"value of odi runs is "+cricketTeamDtoObjectEntry.getValue().getOdiRuns()
                        +"number of fifties"+ cricketTeamDtoObjectEntry.getValue().getNoOfFifties()+ "nu of hundreds"+cricketTeamDtoObjectEntry.getValue().getNoOfHundreds()+
                        "average"+ cricketTeamDtoObjectEntry.getValue().getAverage());
                System.out.println(cricketTeamDtoObjectEntry.getValue().getOdiRuns());//to print only value
            }
            System.out.println("print using iterator=========================================================");
            Iterator<Map.Entry<CricketTeamDto, CricketOdiStatsDto>> entry1 = entry.iterator();
            while(entry1.hasNext())
            {
                Map.Entry<CricketTeamDto, CricketOdiStatsDto> player = entry1.next();
                System.out.println(player.getKey().getJerrseyNum());
                System.out.println(player.getKey().getPlayerName());
                System.out.println(player.getKey().getPlayerType());
                System.out.println(player.getKey().getBirthPlace());
                System.out.println(player.getKey().getBirthDate());
                System.out.println(player.getKey().getMatches());
                System.out.println(player.getKey().getTestRuns()+"value of odi runs is "+player.getValue().getOdiRuns()
                        +"number of fifties"+ player.getValue().getNoOfFifties()+ "nu of hundreds"+player.getValue().getNoOfHundreds()+
                        "average"+ player.getValue().getAverage());
                System.out.println(player.getValue().getOdiRuns());//to print only value

            }

            System.out.println("To print the key=====================================");
            System.out.println(map.keySet());

            System.out.println("To print the values=====================================");
            System.out.println(map.values());

            System.out.println("To clear the values=====================================");
            map.clear();
            System.out.println(map);


        }
    }


