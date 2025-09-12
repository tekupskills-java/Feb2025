package Abstraction;

interface B1{
    void test();
}

abstract class InterfaceAbstractClass implements B1{

   /* @Override
    public void test() {
        System.out.println();
    }*/
}

public class InterfaceRules  implements B1{
    @Override
    public void test() {

    }
}
