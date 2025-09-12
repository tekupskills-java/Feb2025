package Abstraction;

interface A1 {
    void dummy();
}

interface A2 extends A1{
    int addition(int a, boolean b);
    int multiply(int a, int b);
}
//InterfaceImplementsExample implements A1 interface   1
//InterfaceImplementsExample implements A2 interface   2   3
//

public class InterfaceImplementsExample implements A2{

    public static void main(String[] args) {
       // A2 aa = new A2();
    }

    @Override
    public void dummy() {

    }

    @Override
    public int addition(int a, boolean b) {
        return 0;
    }

    @Override
    public int multiply(int a, int b) {
        return 0;
    }

   /* @Override
    public int addition(int a, boolean b) {
        return 0;
    }

    @Override
    public int multiply(int a, int b) {
        return 0;
    }*/
    /*@Override
    public void dummy() {

    }*/
}
