package OOPS.InheritancePrograms;

class ParentHirarchical {
//3 methods
    void method1(){}
    void method2(){}
    void method3(){}
}

class ChildHirarchical1 extends ParentHirarchical{
    //+2 methods   ChildHirarchical1 obj
}

class ChildHirarchical2  extends ParentHirarchical{

}

class ChildHirarchical3  extends ParentHirarchical{
//ChildHirarchical3 obj
}

public class HirarchcalInheritance {
    public static void main(String[] args) {
        ChildHirarchical3 obj = new ChildHirarchical3();
        obj.method2();
    }
}
