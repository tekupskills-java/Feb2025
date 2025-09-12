package Contructor;

public class DummyClass {
    int a;  //variable a got some default value
    String name;

    public static void main(String[] args) {
        DummyClass obj = new DummyClass();
        System.out.println("Default value of int a is "+obj.a);
        System.out.println("Default value of String name  is "+obj.name);
    }

   /* DummyClass(){
        System.out.println("THis is Constructor");
    }*/

    int DummyClass(){
        System.out.println("THis is Method");
        return 100;
    }

/*
    void test(){
        System.out.println("THis is Method");
    }
*/


}
