package Java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMapMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

//Returns length of each name
        names.stream().
                map((String name) -> name.length()).
                forEach(element -> System.out.println("Elements with length is "+element));


        StreamMapMethod obj = new StreamMapMethod();

        /*for(String name : names){
            obj.map(name);
        }*/
    }

    int map(String name){
        System.out.println("Length of "+name + " is "+name.length());
        return name.length();
    }
}
