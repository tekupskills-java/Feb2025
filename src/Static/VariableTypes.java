package Static;

public class VariableTypes {

    int age ;                 //Instance
    static int salary ;       //Static
   // int local;

    void test(){
        int local = 10;   //Local
        System.out.println("Local variable value "+local);
       // age = 3000;
    }

    public static void main(String[] args) {
        VariableTypes obj1 = new VariableTypes();
        System.out.println(obj1.age);  //instance variable
        System.out.println(salary);    //static variable

        VariableTypes obj2 = new VariableTypes();
        System.out.println(obj2.age);  //instance variable

        VariableTypes obj3 = new VariableTypes();
        System.out.println(obj3.age);  //instance variable

        obj2.test();

    }

}
