package ExceptionHandling;

public class IntroToNPE {

    public static void main(String[] args) {    //started main thread
        IntroToNPE introToNPE = new IntroToNPE();
        introToNPE.show();    //NPE
    }

    //Thread dump
    //Heap dump

    void show(){
        System.out.println("Show method ");
        IntroToNPE npe = new IntroToNPE();
        test(npe);

    }

    void test(IntroToNPE npe){
        npe = null;
        npe.dummy();
    }

    void dummy(){

    }

}
