package OOPS.InheritancePrograms;

class ParentA{
    int age = 100;
    String name  = "Java";

    void show(){
        System.out.println("Show method of ParentA class ");
    }

    void test(){
        System.out.println("Test method of ParentA class ");
    }

    int addition(int a, int b){
        int c = a + b;
        System.out.println("Addition of 2 int is "+c);
        return c;
    }
}
//        Child class     extends   Parent class

public class InheritanceBasic extends ParentA{

    public static void main(String[] args) {
        InheritanceBasic obj = new InheritanceBasic(); //Object of InheritanceBasic
        obj.addition(100, 200);

        ParentA parent = new ParentA();
        parent.addition(100, 200);
    }

   /* int addition(int a, int b){
        int c = a + b;
        System.out.println("Addition of 2 int is "+c);
        return c;
    }*/

}

