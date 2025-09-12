package Polymorphism.MethodOverriding;

//The argument list/method signature must be exactly the same
// as that of the overridden/parent class method.
class Rule2Parent {
    void dummy(int a, String b){
        System.out.println("Dummy method of parent class takes 2 args ");
    }
}

public class RuleNo2 extends Rule2Parent{

    @Override
    void dummy(int a, String b) {
        System.out.println("Dummy method of Child class takes 2 args ");
    }
}
