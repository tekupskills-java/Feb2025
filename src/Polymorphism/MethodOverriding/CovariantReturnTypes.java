package Polymorphism.MethodOverriding;

class CovariantParent {

    CovariantParent returnsObject(){

        CovariantParent parent  = new CovariantParent();
        return parent;
    }

}

public class CovariantReturnTypes extends CovariantParent{

    @Override
    CovariantReturnTypes returnsObject() {
        /*CovariantParent parent11 = new CovariantParent();
        return parent11;*/

        CovariantReturnTypes child = new CovariantReturnTypes();
        return child;
    }
}

class P {
    public Object m1() {
        return new Object();
    }
}

class C extends P {
    public Object m1() {
        return 1000;
    }
}
