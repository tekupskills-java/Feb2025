package Polymorphism.MethodOverloading;

public class IntroToPolymorphism {

    //addition method   => 2 parameters
    int addition(int a, int b){
        int c = a + b;
        return c;
    }

    int addition(int a, int b, int c, int d){
        int e = a + b + c + d + 100;
        return e;
    }

    public static void main(String[] args) {
        IntroToPolymorphism obj = new IntroToPolymorphism();
        int result  = obj.addition(100, 300);
        System.out.println("Addition of 2 numbers is "+result);

        //i want to addition but with 4 parameters
    }
}
