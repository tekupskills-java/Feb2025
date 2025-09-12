package Contructor;

public class ConstructorIntro {
    int a;
    long b;
    char c = 'a';
    boolean t = true;
    String name;

    ConstructorIntro(){ //no-argument constructor
        System.out.println("Constructor of a class ");
    }

    public static void main(String[] args) {
        ConstructorIntro obj = new  ConstructorIntro();  //
        System.out.println("default value for int a is "+obj.a);  //0
        System.out.println("default value for long b is "+obj.b); //0
        System.out.println("default value for char c is "+obj.c);  //a
        System.out.println("default value for boolean t is "+obj.t); //true
        System.out.println("default value for String name is "+obj.name); //null
        //obj.test();
    }

    void test(){
        System.out.println("Method ");
    }

}
