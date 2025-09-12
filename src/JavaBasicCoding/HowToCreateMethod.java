package JavaBasicCoding;

public class HowToCreateMethod {

    //4 different syntax for creating methods

    //Note: When you don't want to return anything from method use keyword void.
    //When we have method return type as void, we do not need to write return statement in that method.
    //When we have method return type as anything other than void, we must write return statement in that method.
    //Meaning of void keyword is it returns nothing.
    //

    //Syntax 1
    //access_modifier no_return_type methodName(){
    //}

    void method1() {
        System.out.println("This is called as method in Java");
        int a = 30;
        int b = 70;
        int c =  a +b;
        return;
    }

    void method222(){

    }


    //Syntax 2
    //access_modifier no_return_type methodName(parameters//arguments){
    //}
    void method(int a){

    }

    void method1111(int a, boolean c, long l){

    }

    //Syntax 3
    //access_modifier return_type methodName(){
    // }

    //return_type => a method can use any data type as return_type for a method
    //When we have method return type as anything other than void, we must write return statement in that method.
    int returnNothing(){
        int a = 100;
        int b = 200;
        int c = a + b;
      //  boolean d = false;
        return c;
    }

    String returnName(){
        String name = "Java Program";
        int age = 31;
        return name;
    }


    //Syntax 4
    //access_modifier return_type methodName(parameters){
    // }

    int additionOfThreeParams(int a, int b, int c){
        int d = a + b + c;
        return d;
    }
}
