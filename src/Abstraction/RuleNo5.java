package Abstraction;

/*5) If concrete/non-abstract class extends  abstract class,
then its  mandatory for that child class to provide
method implementations of abstract methods of super class.*/

abstract class Rule5AbstractClass {
    abstract void show();
}

public class RuleNo5 extends Rule5AbstractClass{
    @Override
    void show() {

    }
}
