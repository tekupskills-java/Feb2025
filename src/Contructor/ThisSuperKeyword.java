package Contructor;

class SuperClass {
    SuperClass(){
        System.out.println("no-arg constructor of Super class ");
    }

    SuperClass(int a, String b){
        this();
        System.out.println("2 arg constructor of Super class ");
    }
}

public class ThisSuperKeyword extends SuperClass {
    ThisSuperKeyword(){
        super(100,"Java");
        System.out.println("NO-arg constructor of ThisSuperKeyword class");
    }

    ThisSuperKeyword(String a, int b){
        /*super(100,"Java");*/
        this();
        System.out.println("2 arg constructor of ThisSuperKeyword class");
    }

    public static void main(String[] args) {
        ThisSuperKeyword obj = new ThisSuperKeyword("Java", 10000);
    }
}
