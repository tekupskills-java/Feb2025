package Polymorphism.MethodOverriding;

class RuntimeParent {

    void test(){
        System.out.println("Parent class method");
    }
}
public class WhyRuntimePolymorphismChild extends RuntimeParent{

    @Override
    void test() {
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        RuntimeParent parent  = new WhyRuntimePolymorphismChild();
        parent.test();  //Child
        //as Object type decides which class's method is getting called,
        //and Object creation happens at Runtime, that's why Method Overriding is also called as
        //Runtime polymorphism
    }
}
