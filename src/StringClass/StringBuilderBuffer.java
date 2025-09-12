package StringClass;

public class StringBuilderBuffer {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Program");
        System.out.println(sb);   //Mutable  Java Program

        StringBuffer sbb = new StringBuffer("Java");

        String s = "Java";
        s.concat(" Program");
        System.out.println(s);   //Java

        int age = 100;



      /*  System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));*/

    }
}


