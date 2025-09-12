package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntroToMapInterface {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();



        /*Map<Integer, String> map = new HashMap<>();
        map.put(10, "AA");
        map.put(100, "Test");
        map.put(20, "Java");

        System.out.println("Map size "+map.size()); //3
        System.out.println("Get value from Map "+map.get(100)); //Test
        System.out.println("Get all Keys "+map.keySet()); //10 100 20
        System.out.println("Get all Values "+map.values());  //AA Test Java*/


        Map<Integer, String> map = new HashMap<>();
        map.put(10, "AA");
        map.put(101, "AA");

        System.out.println("Get value from Map "+map.get(10)); //BB

        map.put(104, "AA");  //Entry
        map.put(null, "AA"); //Entry

        map.put(null, "QQ");

        System.out.println("Get value from Map when Key is null "+map.get(null)); //QQ

        System.out.println("Map size "+map.size()); //
        System.out.println("Get value from Map "+map.get(10)); //CC

       // System.out.println("Get value from Map "+map.get(100)); //Test

    }
}
