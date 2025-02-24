package list.arrayList;

import java.util.ArrayList;

public class Bike {

    public static void main(String[] args)
    {
        ArrayList arrayList=new ArrayList();
        System.out.println("the given array is empty"+arrayList.isEmpty());// to check array is empty
        System.out.println(arrayList);
        arrayList.add("suzuki");//to add element into array
        System.out.println("the given array is empty"+arrayList.isEmpty());
        System.out.println(arrayList);
        arrayList.add("yamaha");
        arrayList.add("kawasaki");
        arrayList.add("ducati");
        arrayList.add("honda");
        arrayList.add("hero");
        arrayList.add("royalenfield");
        arrayList.add("java");
        arrayList.add("r1");
        arrayList.add("ninja");
        System.out.println(arrayList);

        System.out.println("value in array index 2 is "+arrayList.get(2));

        arrayList.add(2,"hayabuza");//adding value into index, when we add it will shift all the values
        System.out.println(arrayList);

        System.out.println("this array contains value"+arrayList.contains("r1"));

        arrayList.set(3,"r1");//seting/replacing the value in index 3
        System.out.println(arrayList);

        System.out.println("index of valueis  "+arrayList.indexOf("suzuki"));//getting index as -1

        System.out.println(arrayList.indexOf("hayabuza"));//fetching the index based on index

        System.out.println(arrayList.isEmpty());

        arrayList.add(9,"yamaha");
        System.out.println(arrayList);

        System.out.println("index of value is"+arrayList.indexOf("yamaha"));
        System.out.println(arrayList.lastIndexOf("yamaha"));//it will give last index when the values are same

        System.out.println(arrayList.remove(2));

        System.out.println(arrayList.remove(3));

        System.out.println("the size of an array is "+arrayList.size());

        ArrayList list=new ArrayList();
        list.add("r1");
        list.add("ninja");
        list.add("hayabuza");
        list.add("hero");
        arrayList.retainAll(list);//to retain the certain values
        System.out.println(list);

        System.out.println(arrayList);

        list.clear();
        System.out.println(list);
    }
}
