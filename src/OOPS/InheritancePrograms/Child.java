package OOPS.InheritancePrograms;

class Parent{
    void test(){
        System.out.println("Test method of Parent class ");
    }
    void show(){

    }

}

public class Child extends Parent{
    //avoid code duplication
   /* void test(){
        System.out.println("Test method of Parent class ");
    }*/

    public static void main(String[] args) {
        Child child = new Child();
        child.test();
        child.show();
    }

}
