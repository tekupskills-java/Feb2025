package Static;

public class IntroToStatic {
    static int age = 10000;
    int salary = 100000;    //instance

    public static void main(String[] args) {
       /* IntroToStatic obj = new IntroToStatic(); //
        System.out.println(obj.salary);*/
        System.out.println("static variable "+age);
    }

    void test(){
        System.out.println(age);
    }
}
