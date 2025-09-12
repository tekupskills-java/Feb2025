package Java8;

interface AAA{
    void test();
    void add();

    default void multiply(){
        System.out.println("this is default method");
    }

    static void substraction(){
        System.out.println("static method");
    }
}


class AAAImpl1 implements AAA{

    @Override
    public void test() {

    }

    @Override
    public void add() {

    }

    @Override
    public void multiply() {
        System.out.println("Overriding default method of interface");
    }
}


class AAAImpl2 implements AAA {

    @Override
    public void test() {

    }

    @Override
    public void add() {

    }
}

public class BackwardCompatibility implements AAA{

    @Override
    public void test() {

    }

    @Override
    public void add() {

    }


}
