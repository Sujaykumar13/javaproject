package list.arrayList;

import java.util.ArrayList;

public class Student {

        public static void main(String[] args)
        {
            ArrayList arrayList=new ArrayList();
            System.out.println("the given array is empty"+arrayList.isEmpty());// to check array is empty
            System.out.println(arrayList);
            arrayList.add("sujay");//to add element into array
            System.out.println("the given array is empty"+arrayList.isEmpty());
            System.out.println(arrayList);
            arrayList.add("sneha");
            arrayList.add("rahul");
            arrayList.add("tom");
            arrayList.add("thor");
            arrayList.add("virat");
            arrayList.add("cooper");
            arrayList.add("brand");
            arrayList.add("jhon");
            arrayList.add("hrithik");
            System.out.println(arrayList);

            System.out.println("value in array index 2 is "+arrayList.get(2));

            arrayList.add(2,"smith");//adding value into index, when we add it will shift all the values
            System.out.println(arrayList);

            System.out.println("this array contains value"+arrayList.contains("virat"));

            arrayList.set(3,"abraham");//seting/replacing the value in index 3
            System.out.println(arrayList);

            System.out.println("index of valueis  "+arrayList.indexOf("sujay"));//getting index as -1

            System.out.println(arrayList.indexOf("smith"));//fetching the index based on index

            System.out.println(arrayList.isEmpty());

            arrayList.add(9,"smith");
            System.out.println(arrayList);

            System.out.println("index of value is"+arrayList.indexOf("smith"));
            System.out.println(arrayList.lastIndexOf("smith"));//it will give last index when the values are same

            System.out.println(arrayList.remove(2));

            System.out.println(arrayList.remove(3));

            System.out.println("the size of an array is "+arrayList.size());

            ArrayList list=new ArrayList();
            list.add("sujay");
            list.add("sneha");
            list.add("tom");
            list.add("thor");
            arrayList.retainAll(list);//to retain the certain values
            System.out.println(list);

            System.out.println(arrayList);

            list.clear();
            System.out.println(list);
        }
    }


