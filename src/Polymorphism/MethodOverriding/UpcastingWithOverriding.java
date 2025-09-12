package Polymorphism.MethodOverriding;

class UpcastParent {
    void test(){
        System.out.println("Parent class test method");
    }

    void show(){

    }
}

public class UpcastingWithOverriding extends UpcastParent{

    void dummy(){
        System.out.println("Only present in Child class ");
    }

    @Override
    void test() {
        System.out.println("Child class test method");
    }

    public static void main(String[] args) {
        UpcastParent parent = new UpcastingWithOverriding();
       // parent.dummy();

    }
}
