package Abstraction;


//abstraction is like contract =>

abstract class UseAbstraction {
    abstract void eat();  //declaration
    void show(){
        System.out.println("We are providing implementation ");
    }
}

class IndianWayOfEating extends UseAbstraction {
    @Override
    void eat() {  //provide implementation to the abstract methods of Parent class
        System.out.println("Indians use hands to eat their food");
    }
}

class WesternWayOfEating extends UseAbstraction{
    @Override
    void eat() {//implementation
        System.out.println("Western people use spoon/fork to eat food");
    }
}

public class WhyAbstraction {
}
