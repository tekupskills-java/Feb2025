package Abstraction;

abstract class AdditionAbstract {
    abstract int addition(int a, int b);  //declaration
}

class AbstractionImpl  extends AdditionAbstract {
    @Override
    int addition(int a, int b) {
        return a + b + 100;
    }
}
public class AbstractionUsage extends AdditionAbstract{
    @Override
    int addition(int a, int b) {
        return a + b;
    }
}
