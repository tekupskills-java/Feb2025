package Contructor;

//when we have same methods present in Parent and Child class,
//then Object type will decide which class's method we are going to call.

//Coding to Interface   => Collection framework    => Design principles

class CastingParent {
    void test(){
        System.out.println("Test method of Parent class ");
    }
}

public class WhyWeNeedCasting extends CastingParent {

    void test(){
        System.out.println("Test method of Child class ");
    }

    public static void main(String[] args) {
        CastingParent parent = new CastingParent();   //
        parent.test();   //5   Parent class
        WhyWeNeedCasting child = new WhyWeNeedCasting(); //
        child.test(); // Child class
        CastingParent upcast = new WhyWeNeedCasting();  //
        // Reference Type  =  Actual Object type
        upcast.test();  // Child class    Method Overriding  =>
    }
}
