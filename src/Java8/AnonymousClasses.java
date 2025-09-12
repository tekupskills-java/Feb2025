package Java8;

interface AA{
    void test(int a, String name);
    void aaa();
}


public class AnonymousClasses {

    public static void main(String[] args) {
        AA aa = new AA() {
            @Override
            public void test(int a, String name) {
                System.out.println("Test method implemented  " + a + " "+name);
            }

            @Override
            public void aaa() {
                System.out.println("aaa method");
            }
        };

        aa.test(100, "Java");
    }
}
