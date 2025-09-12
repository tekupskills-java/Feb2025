package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntroToCollection {

    public static void main(String[] args) {
        Emp emp = new Emp("Java", 30);
        //interface  = implementation class
        List list = new ArrayList<>();
        list.add(123);
        list.add("Java");
        list.add(true);
        list.add(emp);

        System.out.println("Print elements in List "+list);
        //append _ after each element in list

        //

        for(Object obj : list){
            if(obj instanceof Integer){
                Integer i = (Integer) obj;
                System.out.println(i+"_"); //
            } else if(obj instanceof  String){

            }

        }

        //Generics => Compile time type-check
        List<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.add("Java");
        stringList.add("true");

        System.out.println("Size of list is "+list.size());   // 3
        System.out.println("Is list Empty "+list.isEmpty());   //false

        list.remove(true);

        System.out.println("Size of list is after removing element "+list.size());  //2

        int[] arr = new int[10];

        arr[0] = 100;

        Set set = new HashSet();

    }
}


class Emp {
    private String name;
    private int age;

    public Emp(){

    }

    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}