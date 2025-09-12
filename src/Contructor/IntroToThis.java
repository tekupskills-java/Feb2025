package Contructor;

public class IntroToThis {
    IntroToThis(){
        this(100);
       // super();
        System.out.println("no-arg Constructor ");
    }

    IntroToThis(int a){
        this(100, "Java", 100000);
        System.out.println("1 arg Constructor ");
    }

    IntroToThis(int a, String b, long l){
        System.out.println("3 arg Constructor ");
    }

    public static void main(String[] args) {
        System.out.println("Test message");
        IntroToThis obj = new IntroToThis(100);
    }
}
