package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashingMeans {

    public static void main(String[] args) {

        HashingMeans obj1 = new HashingMeans();

        HashingMeans obj2 = new HashingMeans();

        System.out.println("Obj1 hashcode "+obj1.hashCode());

        System.out.println("Obj2 hashcode "+obj2.hashCode());

        Map<String, String> map = new HashMap<>();
        map.put("Java", "ABCD");  //hash()  => int value => indexFor() => table array index return
        map.put("Program", "Test"); //hash()  => int value => indexFor() => table array index return
        map.put("A", "TestA"); //hash()  => int value => indexFor() => table array index return

    }
}
