package StringClass;

public class StringKnowledgeTest {

    public static void main(String[] args) {
        char a = 'd' + 10;
        int b = a;
        char c = a;
      /*  System.out.println(a);   //ascii  110  n   d   10010    n
        System.out.println(b);   //110   n   110    110   110
        System.out.println(c);    //n    110     n

        char e = 10 + 'd';
        System.out.println(e);   //10100       n

        String s = "Java";
        s = s.concat(" Programming");
        System.out.println(s);  //Java*/

        String s1 = 100 + " Java";
        System.out.println(s1);
        String s2 = "Java" + 100;
        System.out.println(s2);
        String s3 = (int)'c'+ "java";   //
        System.out.println(s3);    //cjava   99java
        System.out.println('c'+"Java");   //cJava

    }
}
