package ExceptionHandling;

public class MethodStack {

    public static void main(String[] args) {
        MethodStack obj = new MethodStack();
        obj.test1();
    }

    void test1(){
        System.out.println("Test1 method ");
        test2();
    }

    void test2(){
        System.out.println("Test2 method ");
        test3();
    }

    void test3(){
        System.out.println("Test3 method ");
    }
}


