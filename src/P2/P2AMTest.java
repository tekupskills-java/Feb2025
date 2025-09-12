package P2;

import P1.AMTest;

public class P2AMTest extends AMTest{

    public static void main(String[] args) {
        AMTest test = new AMTest();    //HAS-A
        test.publicMethod();


        P2AMTest p2AMTest = new P2AMTest();
        p2AMTest.protectedMethod();
        p2AMTest.publicMethod();

    }
}
