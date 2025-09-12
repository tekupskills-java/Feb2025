package P2;

//import P1.PackageP1;

import P1.PackageP1;
//import P1.PackageP1NonPublicClassP1;

public class PackageP2 extends PackageP1{

    public static void main(String[] args) {
        PackageP2 pp = new PackageP2();
        pp.publicMethod();
      //  pp.defaultMethodP1();

       /* PackageP1 packageP1 = new PackageP1();  //HAS-A   non subclass
        packageP1.publicMethod();*/
        //packageP1.defaultMethodP1();
    }
}

class PackageP2NonPublicClassP2 {

}