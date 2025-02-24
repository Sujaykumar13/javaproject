package list.arrayList;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args)
    {
        ArrayList arrayList=new ArrayList();
        System.out.println("the given array is empty"+arrayList.isEmpty());// to check array is empty
        System.out.println(arrayList);
        arrayList.add(10);//to add element into array
        System.out.println("the given array is empty"+arrayList.isEmpty());
        System.out.println(arrayList);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(100);
        System.out.println(arrayList);

        System.out.println("value in array index 2 is "+arrayList.get(2));

        arrayList.add(2,"java");//adding value into index, when we add it will shift all the values
        System.out.println(arrayList);

        System.out.println("this array contains value"+arrayList.contains(20));

        arrayList.set(3,"python");//seting/replacing the value in index 3
        System.out.println(arrayList);

        System.out.println("index of valueis  "+arrayList.indexOf(30));//getting index as -1 because element not found

        System.out.println(arrayList.indexOf(40));//fetching the index based on index

        System.out.println(arrayList.isEmpty());

        arrayList.add(9,90);
        System.out.println(arrayList);

        System.out.println("index of value is"+arrayList.indexOf(90));
        System.out.println(arrayList.lastIndexOf(90));//it will give last index when the values are same

        System.out.println(arrayList.remove(2));

        System.out.println(arrayList.remove(3));

        System.out.println("the size of an array is "+arrayList.size());

        ArrayList list=new ArrayList();
        list.add(10);
        list.add(20);
        list.add("java");
        arrayList.retainAll(list);//to retain the certain values
        System.out.println(list);

        System.out.println(arrayList);

        list.clear();
        System.out.println(list);
    }
}
