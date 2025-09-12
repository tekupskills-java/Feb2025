package Java8;


@FunctionalInterface
interface LambdaInterface {
    void test(int a, String b);
    //void add();
}


class DD {
    public static void main(String[] args) {
        LambdaInterface lambda = (int aaa, String nnn)->{
            System.out.println("Exmample of Lambda");
        };

        lambda.test(1000, "Java");
    }
}


public class IntroToLambda {

    public static void main(String[] args) {
        LambdaInterface lambdaInterface = (int a, String name) -> {
            System.out.println("Test method implemented " + a + " "+name);
        };

        lambdaInterface.test(100, "Java");
    }
}


interface BBBB {
    int addition(int a, int b);
}


class AAAA {

    public static void main(String[] args) {
        BBBB bb = (int a, int b) -> {
            int c = a + b;
            System.out.println("Addition of 2 numbers is "+c);
            return c;
        };

        bb.addition(100, 300);
    }
}
