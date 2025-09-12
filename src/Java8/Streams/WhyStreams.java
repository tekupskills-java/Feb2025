package Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class WhyStreams {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("ABCDE");
        list.add("OWEEW");
        list.add("ASD");
        list.add("TWERRWERWE");
        list.add("ABCDE");
        list.add("WERW");
        list.add("KGFD");
        list.add("OPPPPO");
        list.add("ABC");
        list.add("DEF");

        //collection print all elements whose length is more than or equal to 5 or start with char A
       /* for(String element : list){

            if(element.length() >= 5 || element.startsWith("A")){
                System.out.println("Elements with length more than 5 are "+element.toLowerCase());
            }

        }*/


        //a source, one or more intermediate operations and a terminal operation
        list.stream().
                filter( s -> s.length() >= 5 || s.startsWith("A")).
                map(str -> str.toLowerCase()).
                sorted().
                forEach(element -> System.out.println("Elements with length more than 5 are "+element));

        System.out.println("Print list "+list);

        //10 hours

        //FB => WA  18 Billions => Data

        //AI => OpenAI  => Microsoft
        //ChatGPT  => Older data => latest
        //ChatGPT 5.0 => UI/UX developers =>
        //Backend UI Cloud  => lay-offs are very common  => prepared
        //QA during Covid   => Manual =>
        //ChatGPT will not take away developers job, Dev needs to use them to enhance productivity
        //3 days => 1 days

        //Spring AI  =>

        IntStream.of(new int[] {4, 7, 1, 8, 3, 9, 7, 9, 10, 11, 20, 15, 15, 25}).
                filter((int i) -> i > 5).
                distinct().
                sorted().
                limit(5).
                forEach(element -> System.out.println("Elements with length more than 5 are "+element));

     /*  List<Integer> listOfInt = IntStream.of(new int[] {4, 7, 1, 8, 3, 9, 7, 9, 10, 11, 20, 15, 15, 25}).
                filter((int i) -> i > 5).
                distinct().
                sorted().collect(Collectors.toList());*/

        List<String> nameList = Arrays.asList("Dinesh", "Ross", "Kagiso", "Steyn");

        Stream<String> stream = nameList.stream();




       // stream.forEach(System.out::println);   //consumed
        //stream.forEach(System.out::println);   //consumed

        Stream<String> stream1 = nameList.stream();
        //stream1.forEach(System.out::println);

    }

    boolean test(String s){

        boolean result = false;
        if(s.length() >= 5 || s.startsWith("A")){
            result =  true;
        }
        return result;
    }

    void printAllElement(){

    }

}
