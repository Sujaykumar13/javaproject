package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Array {
    public static void main(String[] args) {
        int[] array={1,2,4,5,7,8,9,5,1,2,2};
        long count = Arrays.stream(array).filter(x -> x > 5).count();
        System.out.println("array count is"+count);

        long sum = Arrays.stream(array).sum();
        System.out.println("sum of array is"+sum);

        Arrays.stream(array).distinct().forEach(x-> System.out.println(x ));

        OptionalInt minimum = Arrays.stream(array).min();
        System.out.println("minimum value in arrrayb is  "+minimum.getAsInt());

        OptionalInt maximum = Arrays.stream(array).max();
        System.out.println("maximum value in array is   "+maximum.getAsInt());

        OptionalDouble average = Arrays.stream(array).average();
        System.out.println("average value of array is"+average.getAsDouble());

        Integer[] array1={1,2,4,5,7,8,9,5,1,2,2};
        Arrays.asList(array1).stream().sorted(Comparator.reverseOrder()).forEach(x-> System.out.print(x));
        Arrays.asList(array1).stream().sorted().forEach(System.out::println);//another way of print in for each

       // Arrays.stream(array1).collect(Collectors.averagingDouble();
    }
}
