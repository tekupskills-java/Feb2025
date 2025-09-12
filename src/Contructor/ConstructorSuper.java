package Contructor;

class ConstructorSuperParent {
    ConstructorSuperParent(){
        System.out.println("No-arg Constructor of ConstructorSuperParent == 5 ");
    }

    ConstructorSuperParent(int a, int b){
        System.out.println("2 Parameterized Constructor of ConstructorSuperParent == 9 ");
    }

    ConstructorSuperParent(int a, String b, boolean c){
        System.out.println("3 Parameterized Constructor of ConstructorSuperParent == 13 ");
    }
}

public class ConstructorSuper extends ConstructorSuperParent{
    ConstructorSuper(){
        //super(100, 200);  //line changed by Developer
        super(100, "Java", true);
        System.out.println("No-arg Constructor of ConstructorSuperParent == 21 ");
    }

    public static void main(String[] args) {
        ConstructorSuper obj = new ConstructorSuper();
    }
}
