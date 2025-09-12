package ExceptionHandling;

public class StackOverflowTest {

    public static void main(String[] args) {
        StackOverflowTest obj = new StackOverflowTest();
        obj.test1();
    }

    void test1(){
        test2();
    }

    void test2(){
        test1();
    }
}
