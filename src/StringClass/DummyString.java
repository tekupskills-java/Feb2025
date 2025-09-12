package StringClass;

public class DummyString {

    public static void main(String[] args) {

        String s1 = "1000000";
        String s2 = "true";
        String s3 = "c";
        String s4 = "22112323.55f";

       // Using String literals
        //first it will check whether that Object is present in String Constant Pool or not,
        //if the object is present then it will refer to the same object else it will create a new Object.
        String a = "Java";
        a = a.concat(" Program");

        String b = "Java";

        String c = "Java";

        String f = "Java1234";


        //Using new keyword

        //It will always creates a new Object in Heap memory whether that object is present or not in Heap.
        String d = new String("Java");

        String e = new String("Java");


    }
}
