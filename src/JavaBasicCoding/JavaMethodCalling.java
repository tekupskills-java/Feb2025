package JavaBasicCoding;

public class JavaMethodCalling {
    void method1(int a, boolean b){
        System.out.println("Calling method which takes int and boolean parameters and returns nothing");
    }

    void method2(int a, char d){
        System.out.println("This method does not takes any inputs and returns nothing");
    }

    boolean method3(){
        boolean b =  true;
        System.out.println("Method takes 1 parameters and returns boolean value");
        return b;
    }

    int addition(int a, int b, int ccccc){
        return a + b + ccccc;
    }

    String returnString(int a, long b, boolean c, char d){
        return "Test message";
    }

    public static void main(String[] args) {
        JavaMethodCalling mee = new JavaMethodCalling();
        mee.returnString(100, 987979,  true, 'b');
        mee.method3();
        mee.method1(100, false);
        mee.addition(200, 300, 400);
        mee.method2(100, 'r');
    }
}


class TestABCD{

    public static void main(String[] args) {
        TestABCD obj1 = new TestABCD();
        TestABCD obj2 = new TestABCD();
        TestABCD obj3 = new TestABCD();
        TestABCD obj4 = new TestABCD();
        TestABCD obj5 = new TestABCD();
        TestABCD obj6 = new TestABCD();
        TestABCD obj7 = new TestABCD();

        JavaMethodCalling l1 = new JavaMethodCalling();
        l1.method1(100, true);
        JavaMethodCalling l2 = new JavaMethodCalling();
        JavaMethodCalling l3 = new JavaMethodCalling();
        JavaMethodCalling l4 = new JavaMethodCalling();

    }
}