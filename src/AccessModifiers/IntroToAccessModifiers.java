package AccessModifiers;

//import com.sun.corba.se.spi.ior.IdentifiableFactory;

class ParentClass {
    private void test(){
        System.out.println("Test method of parent class");
    }
    public void show(){
        System.out.println("Show method");
    }

}

public class IntroToAccessModifiers extends ParentClass{

    public static void main(String[] args) {

        IntroToAccessModifiers obj = new IntroToAccessModifiers();
        obj.show();
    }
}
