package Polymorphism.MethodOverriding;


//method hiding?
class Rule6Parent {
     static void test(){
        System.out.println("Parent");
    }

    private void privateMethod(){
        System.out.println("private Parent method");
    }
}

public class Rule6 extends Rule6Parent{

   // @Override
   static void test() {
       System.out.println("Child");
    }

    //@Override
    void privateMethod(){
        System.out.println("private Parent method");
    }
}
