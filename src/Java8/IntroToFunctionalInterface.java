package Java8;


interface A{
    void test();
    void add();
}

@FunctionalInterface
interface B {
    void test();
    //void add();
}

public class IntroToFunctionalInterface implements B{

    @Override
    public void test() {

    }
}
