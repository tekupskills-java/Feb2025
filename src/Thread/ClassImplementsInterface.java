package Thread;

interface AAAA{
    void test();
    void show();
}

public class ClassImplementsInterface implements AAAA{

    @Override
    public void test() {
        System.out.println("Implemented test method normal way");
    }

    @Override
    public void show() {

    }

    public static void main(String[] args) {
        ClassImplementsInterface obj = new ClassImplementsInterface();
        obj.test();
        obj.show();
    }
}


class AnonymousClass {

    public static void main(String[] args) {

        AAAA aaaa = new AAAA() {
            @Override
            public void test() {
                System.out.println("Implemented test method anonymous");
            }

            @Override
            public void show() {
                System.out.println("Show method implemented");
            }
        };

        aaaa.test();
        aaaa.show();

    }

}