package Contructor;

public class TypesOfConstructors {

    int a;
    String name;

    TypesOfConstructors(){
        System.out.println("This is no-arg Constructor");
    }

    TypesOfConstructors(int b, String s){
       /* this.a = b;
        this.name = s;
        */
        System.out.println("This is Parameterized Constructor");
    }

    TypesOfConstructors(int b, String s, boolean n){
       /* this.a = b;
        this.name = s;
        */
        System.out.println("This is Parameterized Constructor takes 3 params");
    }

    public static void main(String[] args) {
        TypesOfConstructors obj1 = new TypesOfConstructors();

        //TypesOfConstructors obj2 = new TypesOfConstructors(100, "Test");
        TypesOfConstructors obj3 = new  TypesOfConstructors(10000, "Java", true);
    }


}
