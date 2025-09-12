package Polymorphism.MethodOverriding;

// Return type must be same for both parent and child class methods.
// -> Primitive data types

class Rule3Parent{

    int addition(int a, int b){
        return a+b;
    }
}

public class RuleNo3 extends Rule3Parent{

    @Override
    int addition(int a, int b) {
        return a+b;
    }
}
