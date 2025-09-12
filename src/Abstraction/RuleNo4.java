package Abstraction;

/*4) If one abstract class extends another abstract class,
then it's not mandatory for that child class to provide method
implementations of abstract methods of super class.*/


abstract class Rule4Abstract {
    abstract void test();
}

abstract class TestRule4 extends Rule4Abstract{
    @Override
    void test() {
        System.out.println("test method implemented in child class");
    }
}

public class RuleNo4 {
}
