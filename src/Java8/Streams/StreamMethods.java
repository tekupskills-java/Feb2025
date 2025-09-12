package Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Davida");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("Johnyy");

        //map
        //filter
        //collect
        //forEach
        //count
        //limit
        //distinct
        //skip
        //sorted()
        //flatMap   => flatten
        //reduce =>10 elements =>
        //peek

        /*if(names.stream().anyMatch((String name) -> name.length() < 5))
        {
            System.out.println("Yes... There is a name exist with 5 letters");
        }*/

        if(names.stream().allMatch((String name) -> name.length() > 5))
        {
            System.out.println("All are big names");
        }


        /*int sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce(10, (a, b) -> a+b);
        System.out.println("Result is "+sum);  //32    32*/

       /* Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).forEach((int i) -> {
                i = i +10;
                System.out.println(i);
        });*/

        List<String> list = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println(list);  //three Three four FOUR


    }
}
