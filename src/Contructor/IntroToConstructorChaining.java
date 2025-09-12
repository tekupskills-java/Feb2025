package Contructor;

class ParentConstructor {
    ParentConstructor(){
        System.out.println("No-arg Constructor of ParentConstructor class ");
    }
    ParentConstructor(int a){
        System.out.println("Params Constructor of ParentConstructor class ");
    }
}

public class IntroToConstructorChaining extends ParentConstructor{

    IntroToConstructorChaining(){
       // super();   //JVM will add this line
        System.out.println("Constructor of IntroToConstructorChaining class ");
    }

    public static void main(String[] args) {
         IntroToConstructorChaining obj = new IntroToConstructorChaining();
        //ParentConstructor child = new ParentConstructor();
    }
}
