package Thread;

interface BBB{
    void test();
}


public class TestAnonymous {

    public static void main(String[] args) {
        BBB obj = new BBB(){
            @Override
            public void test() {

            }
        };

        obj.test();
    }
}
