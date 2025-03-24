package com.maps;

import java.util.*;

public class TreeMapExample {


        public static void main(String[] args) {

            Map<Object,String> map = new TreeMap();
            System.out.println("To add the values and key=====================================");
            map.put(1,"Rahul");
            map.put(18,"virat");
            map.put(45,"Rohit");
            //we not able add null in treemap because it will throw null pointer exception
            map.put(77,"gill");
            map.put(7,"dhoni");
            map.put(44,"sehwag");
            map.put(33,"jaiswal");
            map.put(99,"ashwin");
            map.put(8,"jaddu");
            map.put(17,"abd");
            map.put(56,"starc");
            map.put(11,"shami");
            map.put(19,"siraj");
            map.put(22,"kuldeep");
            map.put(88,"smith");
            map.put(25,"jhaeer");
            map.put(19,"dravid");
            map.put(333,"gayle");
            map.put(80,"murali");
            map.put(20,"chahal");
            System.out.println(map);

            System.out.println("To print the value using key=====================================");
            System.out.println(map.get(1));
            System.out.println(map.get(18));
            System.out.println(map.get(17));
            System.out.println(map.get(45));
            System.out.println(map.get(55));

            System.out.println("To print the key=====================================");
            Set keys = map.keySet();
            System.out.println("To print the values usinng keyset=====================================");
            for (Object key : keys) {
                System.out.println("key is"+key +"value is"+map.get(key));

            }
            System.out.println("To print the values usinng for =====================================");
            Set<Map.Entry<Object, String>> entry = map.entrySet();
            for (Map.Entry<Object, String> objectStringEntry : entry) {
                System.out.println("key is"+objectStringEntry.getKey()+"value is"+objectStringEntry.getValue());
            }

            Iterator<Map.Entry<Object, String>> entry1 = entry.iterator();
            while(entry1.hasNext())
            {
                Map.Entry<Object, String> player = entry1.next();
                System.out.println(player.getKey());
                System.out.println(player.getValue());

            }
            System.out.println("To print the values=====================================");
            System.out.println(map.values());

            System.out.println("To clear the values=====================================");
            map.clear();
            System.out.println(map);

        }
    }


