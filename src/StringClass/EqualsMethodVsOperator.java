package StringClass;

public class EqualsMethodVsOperator {

    public static void main(String[] args) {
        //equals()    vs == operator

        //equals method check for the contents of an Object
        //== will check memory address

        String s1 = new String("Java");   //Heap

        String s2 = "Java";    //SCP

        boolean usingEqualsMethod = s1.equals(s2);  //true
        System.out.println("Using equals method "+usingEqualsMethod);

        boolean usingOperator = (s1 == s2);  //false
        System.out.println("Using equals operator "+usingOperator);


        StringBuilder sb1 = new StringBuilder("Java");

        StringBuilder sb2 = new StringBuilder("Java");

        boolean t = (sb1.equals(sb2));
        System.out.println("Comparing 2 StringBuilder objects using equals "+t);  //true    false


    }
}
