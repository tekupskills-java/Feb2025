package OOPS.InheritancePrograms;
class GrandParent {  //GP => ML =>
    void method1(){
        System.out.println("method1() if GrandParent class");
    }
}
class ParentClass extends GrandParent{
    void method2(){
        System.out.println("method2() if ParentClass class");
    }
}

public class MultiLevel extends ParentClass{
    void method3(){
        System.out.println("method3 of Multilevel class");
    }
    void method4(){
        System.out.println("method4 of Multilevel class");
    }

    public static void main(String[] args) {
        MultiLevel level = new MultiLevel();
        level.method1();
        level.method2();
        level.method3();
        level.method4();
    }

}
