package Contructor;

//Git
//Maven
//Junit  Mockito
//
//UI => React/Angular    next.js

class NoDownCastingParent {
    void test(){
        System.out.println("Test method of Parent class");
    }

}

public class WhyNoToDownCastingChild extends NoDownCastingParent{

    /*void test(){
        System.out.println("Test method of Child class");
    }*/

    void dummy(){
        System.out.println("Dummy method is present in Child class only, Parent class " +
                "does not know anything about this method ");
    }

    public static void main(String[] args) {
        NoDownCastingParent parent = new NoDownCastingParent();
        parent.test();
      //  parent.dummy();

        WhyNoToDownCastingChild child = new WhyNoToDownCastingChild();
        child.test();
        child.dummy();

        NoDownCastingParent upcast = new WhyNoToDownCastingChild();
        upcast.test();
       // upcast.dummy();    //

        WhyNoToDownCastingChild downCasting = (WhyNoToDownCastingChild) new NoDownCastingParent();
        downCasting.dummy();   //

    }
}
