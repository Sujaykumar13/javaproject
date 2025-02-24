package list.arrayList;

import java.util.ArrayList;

public class Arraylist3 {

    public static void main(String[] args)
    {
        ArrayList arrayList=new ArrayList();
        System.out.println("the given array is empty"+arrayList.isEmpty());// to check array is empty
        System.out.println(arrayList);
        arrayList.add(10);//to add element into array
        System.out.println("the given array is empty"+arrayList.isEmpty());
        System.out.println(arrayList);
        arrayList.add(20);
        arrayList.add("java");
        arrayList.add(40);
        arrayList.add("python");
        arrayList.add(60);
        arrayList.add("sujay");
        arrayList.add(80);
        arrayList.add("sneha");
        arrayList.add(100);
        System.out.println(arrayList);

        System.out.println("value in array index 2 is "+arrayList.get(2));

        arrayList.add(2,"sql");//adding value into index, when we add it will shift all the values
        System.out.println(arrayList);

        System.out.println("this array contains value"+arrayList.contains(20));
        System.out.println("this array contains value"+arrayList.contains("java"));

        arrayList.set(3,"python");//seting/replacing the value in index 3
        System.out.println(arrayList);

        System.out.println("index of valueis  "+arrayList.indexOf("java"));//getting index as -1

        System.out.println(arrayList.indexOf(100));//fetching the index based on value

        System.out.println(arrayList.isEmpty());

        arrayList.add(9,100);
        System.out.println(arrayList);

        System.out.println("index of value is"+arrayList.indexOf("java"));
        System.out.println(arrayList.lastIndexOf("java"));//it will give last index when the values are same

        System.out.println(arrayList.remove(2));

        System.out.println(arrayList.remove(3));

        System.out.println("the size of an array is "+arrayList.size());

        ArrayList list=new ArrayList();
        list.add("python");
        list.add(20);
        list.add(10);
        list.add("java");
        arrayList.retainAll(list);//to retain the certain values
        System.out.println(list);

        System.out.println(arrayList);

        list.clear();
        System.out.println(list);
    }
}
