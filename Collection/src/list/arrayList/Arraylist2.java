package list.arrayList;

import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args)
    {
        ArrayList arrayList=new ArrayList();
        System.out.println("the given array is empty"+arrayList.isEmpty());// to check array is empty
        System.out.println(arrayList);
        arrayList.add("java");//to add element into array
        System.out.println("the given array is empty"+arrayList.isEmpty());
        System.out.println(arrayList);
        arrayList.add("python");
        arrayList.add("HTML");
        arrayList.add("CSS");
        arrayList.add("javascript");
        arrayList.add("c");
        arrayList.add("ruby");
        arrayList.add("sql");
        arrayList.add("R");
        arrayList.add("ML");
        System.out.println(arrayList);

        System.out.println("value in array index 2 is "+arrayList.get(2));

        arrayList.add(2,"AI");//adding value into index, when we add it will shift all the values
        System.out.println(arrayList);

        System.out.println("this array contains value"+arrayList.contains("R"));

        arrayList.set(3,"2");//seting/replacing the value in index 3
        System.out.println(arrayList);

        System.out.println("index of valueis  "+arrayList.indexOf("java"));//getting index as -1

        System.out.println(arrayList.indexOf("SQL"));//fetching the index based on index

        System.out.println(arrayList.isEmpty());

        arrayList.add(9,"java");
        System.out.println(arrayList);

        System.out.println("index of value is"+arrayList.indexOf("java"));
        System.out.println(arrayList.lastIndexOf("java"));//it will give last index when the values are same

        System.out.println(arrayList.remove(2));

        System.out.println(arrayList.remove(3));

        System.out.println("the size of an array is "+arrayList.size());

        ArrayList list=new ArrayList();
        list.add("R");
        list.add("sql");
        list.add("java");
        arrayList.retainAll(list);//to retain the certain values
        System.out.println(list);

        System.out.println(arrayList);

        list.clear();
        System.out.println(list);
    }
}
