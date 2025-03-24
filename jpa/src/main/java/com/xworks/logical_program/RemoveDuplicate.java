package com.xworks.logical_program;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,2,8,4,6,9,5,5,8};

        System.out.println("before removing duplicate values "+ Arrays.toString(a));

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<a.length;i++)
        {
            hashSet.add(a[i]);
        }

        System.out.println("after removing duplicate values "+hashSet);
    }
}
