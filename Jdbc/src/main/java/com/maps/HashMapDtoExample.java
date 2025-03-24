package com.maps;

import com.xworks.dto.CricketTeamDto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDtoExample {

    public static void main(String[] args) {

        Map<Object,CricketTeamDto> map = new HashMap();
        System.out.println("To add the values and key=====================================");
        CricketTeamDto player1 = new CricketTeamDto(18, "viratkohli","batter",
                "delhi","1988-11-06",119,9012);
        map.put(1,player1);
        CricketTeamDto player2 = new CricketTeamDto(45, "rohitsharma","batter",
                "mumbai","1987-04-30",64,4125);
        map.put(2,player2);
        CricketTeamDto player3 = new CricketTeamDto(64, "jaiswal", "leftbatter",
                "up", "1999-12-28",14,1825);
        map.put(3,player3);
        CricketTeamDto player4 = new CricketTeamDto(1, "KL Rahul", "wicketkeeper",
                "mangalore", "1992-04-16",54,3125);
        map.put(4,player4);
        CricketTeamDto player5 = new CricketTeamDto(77, "gill", "batter",
                "punjab", "1999-08-11",34,2125);
        map.put(5,player5);
        CricketTeamDto player6 = new CricketTeamDto(56, "pant", "wicketkeeper",
                "delhi", "1997-10-04",44,2225);
        map.put(6,player6);
        CricketTeamDto player7 = new CricketTeamDto(88, "sarfraj", "wicketkeeper",
                "mumbai", "1997-05-17",4,312);
        map.put(7,player7);
        CricketTeamDto player8 = new CricketTeamDto(17, "jadeja", "all rounder",
                "saurastra", "1998-04-17",84,4125);
        map.put(8,player8);
        CricketTeamDto player9 = new CricketTeamDto(99, "ashwin", "all rounder",
                "chennai", "1984-06-26",114,3525);
        map.put(9,player9);
        CricketTeamDto player10 = new CricketTeamDto(66, "sundar", "spinner",
                "chennai", "1990-03-26",24,1125);
        map.put(10,player10);
        CricketTeamDto player11 = new CricketTeamDto(22, "Kuldeep", "spinner",
                "up", "1994-08-16",44,725);
        map.put(11,player11);
        CricketTeamDto player12 = new CricketTeamDto(78, "bumrah", "bowler",
                "baroda", "1992-05-16",64,725);
        map.put(12,player12);
        CricketTeamDto player13 = new CricketTeamDto(33, "siraj", "bowler",
                "punjab", "1993-02-06",44,1125);
        map.put(13,player13);
        CricketTeamDto player14 = new CricketTeamDto(54, "prasid", "bowler",
                "bangalore", "1992-05-26",14,425);
        map.put(14,player14);
        CricketTeamDto player15 = new CricketTeamDto(55, "akashr", "bowler",
                "kolkata", "1995-09-09",10,225);
        map.put(15,player15);
        CricketTeamDto player16 = new CricketTeamDto(101, "mayank", "batting",
                "bangalore", "1992-08-07",88,125);
        map.put(16,player16);
        CricketTeamDto player17 = new CricketTeamDto(3, "raina", "batting",
                "gujrat", "1982-06-07",78,245);
        map.put(17,player17);
        CricketTeamDto player18 = new CricketTeamDto(44, "sehwag", "batting",
                "delhi", "1980-08-12",69,425);
        map.put(18,player18);
        CricketTeamDto player19 = new CricketTeamDto(7, "dhoni", "keeper",
                "jharkand", "1985-07-14",99,385);
        map.put(19,player19);
        CricketTeamDto player20 = new CricketTeamDto(10, "sachin", "batting",
                "mumbai", "1975-08-10",102,568);
        map.put(20,player20);

        System.out.println(map);

        System.out.println("To print the value using key=====================================");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
        System.out.println(map.get(5));
        System.out.println(map.get(6));
        System.out.println(map.get(7));
        System.out.println(map.get(8));
        System.out.println(map.get(9));
        System.out.println(map.get(10));
        System.out.println(map.get(11));
        System.out.println(map.get(12));
        System.out.println(map.get(13));
        System.out.println(map.get(14));
        System.out.println(map.get(15));
        System.out.println(map.get(16));
        System.out.println(map.get(17));
        System.out.println(map.get(18));
        System.out.println(map.get(19));
        System.out.println(map.get(20));
        //to traverse in map we need to use entryset like iterartor in collection Set<Map.Entry<Object,String>> entry=//
        //entry.getkey() to get key

        System.out.println("To print the key=====================================");
        System.out.println(map.keySet());

        System.out.println("print using keyset=========================================================");
        Set<Object> keys = map.keySet();//using keyset traverseing
        for (Object key : keys) {
           CricketTeamDto players =map.get(key);
            System.out.println(players.getJerrseyNum());
            System.out.println(players.getPlayerName());
            System.out.println(players.getPlayerType());
            System.out.println(players.getBirthDate());
            System.out.println(players.getBirthPlace());
            System.out.println(players.getMatches());
            System.out.println(players.getTestRuns());
        }

        System.out.println("print using for=========================================================");
        Set<Map.Entry<Object, CricketTeamDto>> entry = map.entrySet();
        for (Map.Entry<Object, CricketTeamDto> objectCricketTeamDtoEntry : entry) {
            System.out.println(objectCricketTeamDtoEntry.getKey());
            System.out.println(objectCricketTeamDtoEntry.getValue().getJerrseyNum());
            System.out.println(objectCricketTeamDtoEntry.getValue().getPlayerName());
            System.out.println(objectCricketTeamDtoEntry.getValue().getBirthPlace());
            System.out.println(objectCricketTeamDtoEntry.getValue().getBirthDate());
            System.out.println(objectCricketTeamDtoEntry.getValue().getPlayerType());
            System.out.println(objectCricketTeamDtoEntry.getValue().getMatches());
            System.out.println(objectCricketTeamDtoEntry.getValue().getTestRuns());
        }

        System.out.println("print using iterator=========================================================");
        Iterator<Map.Entry<Object, CricketTeamDto>> entry1 = entry.iterator();
        while(entry1.hasNext())
        {
            Map.Entry<Object, CricketTeamDto> player = entry1.next();
            System.out.println(player.getKey());
            System.out.println(player.getValue().getJerrseyNum());
            System.out.println(player.getValue().getPlayerName());
            System.out.println(player.getValue().getBirthPlace());
            System.out.println(player.getValue().getBirthDate());
            System.out.println(player.getValue().getPlayerType());
            System.out.println(player.getValue().getMatches());
            System.out.println(player.getValue().getTestRuns());
        }
        System.out.println("To print the values=====================================");
        System.out.println(map.values());

        System.out.println("To clear the values=====================================");
        map.clear();
        System.out.println(map);

    }
}
//we need to find
//datastruture is hashtable for hashmap and  for linkedhashmap linkedlist+hashtable
//default size is 16
//load factor 75% it is when we need to increase the size
//costructor and methods
//key and value can be null than key not allow duplicate and value allow duplicate
//multiple null cannot allow in key
//all wrapper class are comparable
