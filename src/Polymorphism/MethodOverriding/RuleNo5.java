package Polymorphism.MethodOverriding;
//A method declared final cannot be overridden.
//final is like a constant


class Rule5Parent {
     void test(){

    }
}

public class RuleNo5 extends Rule5Parent{

    @Override
    void test() {

    }
}
