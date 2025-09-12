package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class IntroToHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("XYZ");
        set.add("PRRR");
        set.add("ABC");
        set.add("OOOO");
        set.add("POR");
        set.add("ABC");   //Key for HashMap

        System.out.println("Set size is "+set.size()); //5
        System.out.println(set);

    }
}
