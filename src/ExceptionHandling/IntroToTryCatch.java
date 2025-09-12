package ExceptionHandling;

public class IntroToTryCatch {

    public static void main(String[] args) {
        IntroToTryCatch obj = null;
      /*  try {

        } catch (NullPointerException npe){

        }
        obj.test(); */   //NPE

        System.out.println("Will this line get executed? ");
    }

    void test(){
        System.out.println("test message ");
    }
}
