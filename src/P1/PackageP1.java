package P1;

public class PackageP1 {
    private void privateMethodP1(){
        System.out.println("This is Private method of public class ");
    }
    void defaultMethodP1(){
        System.out.println("This is default method of public class ");
    }
    public void publicMethod(){
        System.out.println("This is public method of public class ");
    }
}


class NonSubClass {
    public static void main(String[] args) {
        PackageP1 packageP1 = new PackageP1();
        packageP1.defaultMethodP1();
        packageP1.publicMethod();
    }
}

class PackageP1NonPublicClassP1 extends PackageP1{
  /*  private void privateMethodTest(){
        System.out.println("This is Private method of default class ");
    }*/

    public static void main(String[] args) {
        PackageP1NonPublicClassP1 pp = new PackageP1NonPublicClassP1();
        pp.defaultMethodP1();
        pp.publicMethod();
    }
}

