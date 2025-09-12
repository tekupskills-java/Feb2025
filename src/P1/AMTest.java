package P1;

public class AMTest {

    private void privateMethod(){
        System.out.println("Private method");
    }

    void defaultMethod(){
        System.out.println("Default method");
    }

    protected void protectedMethod(){
        System.out.println("Protected method");
    }

    public void publicMethod(){
        System.out.println("Public method");
    }
}

class AMDefaultClass {
    private void privateMethod_Default(){
        System.out.println("Private method _Default");
    }

    void defaultMethod_Default(){
        System.out.println("Default method _Default");
    }

    protected void protectedMethod_Default(){
        System.out.println("Protected method _Default");
    }

    public void publicMethod_Default(){
        System.out.println("Public method _Default");
    }
}
