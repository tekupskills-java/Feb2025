package P1;

public class AMDummy extends AMDefaultClass{

    public static void main(String[] args) {
        AMTest test = new AMTest();   //HAS-A
        test.defaultMethod();
        test.protectedMethod();
        test.publicMethod();
        //except private we can access all other methods

      /*  AMDefaultClass defaultClass = new AMDefaultClass();
        defaultClass.*/
    }
}
