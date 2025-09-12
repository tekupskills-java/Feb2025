package JavaBasicCoding;

public class CreateObjectOfClass {
    int age = 31;
    long salary = 100000;

    void show(){
        System.out.println("Welcome to Show method");
    }

    int addition(int a, int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        //Syntax for creating an Object of a class
        //ClassName referenceName = new ClassName();
        CreateObjectOfClass obj = new CreateObjectOfClass();   //

        //Syntax for accessing variables and methods
        //referenceName.variableName;
        System.out.println("Accessing age variables of a class "+ obj.age);
        System.out.println("Accessing salary variables of a class "+ obj.salary);

        //referenceName.methodname();
        //referenceName.methodname(parameters);
        obj.show();
        System.out.println("Addition of 2 numbers is  "+obj.addition(100, 200));  //300

        int result  =  obj.addition(1001, 500);

        System.out.println("Addition of 2 numbers is using third variable is  "+result);   //1501
    }
}


class Test{
    public static void main(String[] args) {
        Test obj = new Test();  //
    }
}