package Contructor;



class CastingParent1 {

}

public class IntroToCasting1 extends CastingParent1 {

    public static void main(String[] args) {
        int a = 100;   //primitive
        String s = new String("Java");  // Non primitive inbuilt data type
        // Reference Type  =  Actual Object type

        //Parent class = Child class    => Up casting

        //Child class = Parent class   => down casting

        IntroToCasting1 obj = new IntroToCasting1();  //no casting    // Non primitive Use defined data type

        CastingParent1 parent = new IntroToCasting1();  // Up casting  Natural casting

        IntroToCasting1 child = (IntroToCasting1) new CastingParent1();  // down casting   explicit casting

        System.out.println("Test message");


    }
}



class ParentClass {

}


class ChildClass extends ParentClass{

    public static void main(String[] args) {
        //upcasting
        ParentClass parent = new ChildClass();   //object or instance  Object is an instance of a class.

        ParentClass parent1 = new ChildClass();   //object or  instance

        //down casting
        ChildClass child = (ChildClass) new ParentClass();

        ChildClass cc = new ChildClass();   //no casting
    }

}