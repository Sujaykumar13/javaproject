package com.maps;

import com.xworks.dto.CricketTeamDto;

import java.util.*;

public class LinkedHashMapDtoExample {
    public static void main(String[] args) {

        Map< CricketTeamDto,Object> map = new LinkedHashMap<>();
        System.out.println("To add the values and key=====================================");
        CricketTeamDto player1 = new CricketTeamDto(18, "viratkohli","batter",
                "delhi","1988-11-06",119,9012);
        map.put(player1,1);
        CricketTeamDto player2 = new CricketTeamDto(45, "rohitsharma","batter",
                "mumbai","1987-04-30",64,4125);
        map.put(player2,2);
        CricketTeamDto player3 = new CricketTeamDto(64, "jaiswal", "leftbatter",
                "up", "1999-12-28",14,1825);
        map.put(player3,3);
        CricketTeamDto player4 = new CricketTeamDto(1, "KL Rahul", "wicketkeeper",
                "mangalore", "1992-04-16",54,3125);
        map.put(player4,4);
        CricketTeamDto player5 = new CricketTeamDto(77, "gill", "batter",
                "punjab", "1999-08-11",34,2125);
        map.put(player5,5);
        CricketTeamDto player6 = new CricketTeamDto(56, "pant", "wicketkeeper",
                "delhi", "1997-10-04",44,2225);
        map.put(player6,6);
        CricketTeamDto player7 = new CricketTeamDto(88, "sarfraj", "wicketkeeper",
                "mumbai", "1997-05-17",4,312);
        map.put(player7,7);
        CricketTeamDto player8 = new CricketTeamDto(17, "jadeja", "all rounder",
                "saurastra", "1998-04-17",84,4125);
        map.put(player8,8);
        CricketTeamDto player9 = new CricketTeamDto(99, "ashwin", "all rounder",
                "chennai", "1984-06-26",114,3525);
        map.put(player9,10);
        CricketTeamDto player10 = new CricketTeamDto(66, "sundar", "spinner",
                "chennai", "1990-03-26",24,1125);
        map.put(player10,10);
        CricketTeamDto player11 = new CricketTeamDto(22, "Kuldeep", "spinner",
                "up", "1994-08-16",44,725);
        map.put(player11,11);
        CricketTeamDto player12 = new CricketTeamDto(78, "bumrah", "bowler",
                "baroda", "1992-05-16",64,725);
        map.put(player12,12);
        CricketTeamDto player13 = new CricketTeamDto(33, "siraj", "bowler",
                "punjab", "1993-02-06",44,1125);
        map.put(player13,13);
        CricketTeamDto player14 = new CricketTeamDto(54, "prasid", "bowler",
                "bangalore", "1992-05-26",14,425);
        map.put(player14,14);
        CricketTeamDto player15 = new CricketTeamDto(55, "akashr", "bowler",
                "kolkata", "1995-09-09",10,225);
        map.put(player15,15);
        CricketTeamDto player16 = new CricketTeamDto(101, "mayank", "batting",
                "bangalore", "1992-08-07",88,125);
        map.put(player16,16);
        CricketTeamDto player17 = new CricketTeamDto(3, "raina", "batting",
                "gujrat", "1982-06-07",78,245);
        map.put(player17,17);
        CricketTeamDto player18 = new CricketTeamDto(44, "sehwag", "batting",
                "delhi", "1980-08-12",69,425);
        map.put(player18,18);
        CricketTeamDto player19 = new CricketTeamDto(7, "dhoni", "keeper",
                "jharkand", "1985-07-14",99,385);
        map.put(player19,19);
        CricketTeamDto player20 = new CricketTeamDto(10, "sachin", "batting",
                "mumbai", "1975-08-10",102,568);
        map.put(player20,20);

        System.out.println(map);

        System.out.println("To print the value using key=====================================");

        Set<CricketTeamDto> keys = map.keySet();

        for (CricketTeamDto key : keys) {
            System.out.println(map.get(key));
            System.out.println(key.getJerrseyNum()+"value is"+map.get(key));
            System.out.println(key.getPlayerName()+"value is"+map.get(key));
            System.out.println(key.getPlayerType()+"value is"+map.get(key));
            System.out.println(key.getBirthPlace()+"value is"+map.get(key));
            System.out.println(key.getBirthDate()+"value is"+map.get(key));
            System.out.println(key.getMatches()+"value is"+map.get(key));
            System.out.println(key.getTestRuns()+"value is"+map.get(key));
        }
        System.out.println("print using for=========================================================");
        Set<Map.Entry<CricketTeamDto, Object>> entry = map.entrySet();
        for (Map.Entry<CricketTeamDto, Object> cricketTeamDtoObjectEntry : entry) {
            System.out.println(cricketTeamDtoObjectEntry.getKey().getJerrseyNum()+"value is "+cricketTeamDtoObjectEntry.getValue());
            System.out.println(cricketTeamDtoObjectEntry.getKey().getPlayerName()+"value is "+cricketTeamDtoObjectEntry.getValue());
            System.out.println(cricketTeamDtoObjectEntry.getKey().getPlayerType()+"value is "+cricketTeamDtoObjectEntry.getValue());
            System.out.println(cricketTeamDtoObjectEntry.getKey().getBirthPlace()+"value is "+cricketTeamDtoObjectEntry.getValue());
            System.out.println(cricketTeamDtoObjectEntry.getKey().getBirthDate()+"value is "+cricketTeamDtoObjectEntry.getValue());
            System.out.println(cricketTeamDtoObjectEntry.getKey().getMatches()+"value is "+cricketTeamDtoObjectEntry.getValue());
            System.out.println(cricketTeamDtoObjectEntry.getKey().getTestRuns()+"value is "+cricketTeamDtoObjectEntry.getValue());
        }
        System.out.println("print using iterator=========================================================");
        Iterator<Map.Entry<CricketTeamDto, Object>> entry1 = entry.iterator();
        while(entry1.hasNext())
        {
            Map.Entry<CricketTeamDto, Object> player = entry1.next();
            System.out.println(player.getKey().getJerrseyNum()+"value is "+player.getValue());
            System.out.println(player.getKey().getPlayerName()+"value is "+player.getValue());
            System.out.println(player.getKey().getPlayerType()+"value is "+player.getValue());
            System.out.println(player.getKey().getBirthPlace()+"value is "+player.getValue());
            System.out.println(player.getKey().getBirthDate()+"value is "+player.getValue());
            System.out.println(player.getKey().getMatches()+"value is "+player.getValue());
            System.out.println(player.getKey().getTestRuns()+"value is "+player.getValue());
            
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
