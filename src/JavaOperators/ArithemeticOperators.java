package JavaOperators;

public class ArithemeticOperators {

    public static void main(String[] args) {
        int a =  10;
        int b = 5;

        int add = a + b;
        System.out.println("Result of + operator is "+add);  //15

        int sub = b - a;
        System.out.println("Result of - operator is "+sub);  // -5

        int mul = a * b;
        System.out.println("Result of * operator is "+mul);  //50

        int div = a / b;
        System.out.println("Result of / operator is "+div);  //2

        int c = 23 % 5;
        // int mod = a % b;
        System.out.println("Result of % operator is "+c);  // 0  3
    }
}
