package AccessModifiers;

class Car {
    void applyBreak(){

    }

    public static void main(String[] args) {
        Engine engine = new Engine();   //HAS-A
        engine.startEngine();
    }
}

class Engine{
    void startEngine(){}
}


class Nexon extends Car { //IS-A

}

public class IsAHasAReltionship {
}
