package StringClass;

public class StringTest {

    public static void main(String[] args) {

        String s1 =  new String("Java");  //Heap
        //whenever we use new keyword for creating a String object,
        //it will always return a new object.

        String s2 =  new String("Java");


        String t1 = "Java";   //SCP

        String t2 = "Java";   //

        boolean r1 = s1.equals(t2);
        boolean r2 = (t1 == t2);
        boolean r3 = (s1 == t1);
        boolean r4 = (s1 == s2);

        System.out.println("Result r1 is "+r1); //true
        System.out.println("Result r2 is "+r2); //true
        System.out.println("Result r3 is "+r3); //false
        System.out.println("Result r4 is "+r4); //false

        String t3 = "Java Program";                //SCP
        String t4 = t1.concat(" Program");     //Heap

        boolean r5 = (t3 == t4);
        System.out.println("Result r5 is "+r5); // false

        String t5 = "JAVA";
        String t6 = t1.toUpperCase();
        boolean r6 = (t5 == t6);
        System.out.println("Result r6 is "+r6); // false


    }
}
