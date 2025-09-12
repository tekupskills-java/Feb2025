package ExceptionHandling;

public class IntroToFinally {

    public static void main(String[] args) {
        try{
            int a = 100 / 10;    //Arithmetic
            int[] arr = new int[10];    //0 - 9
            arr[19] = 100;   //AIOB
            SingleTryMultipleCatch obj  = new SingleTryMultipleCatch();
            // obj =  null;
            System.out.println("what will happen to this line? ");
            obj.dummy();  //NPE
        } catch (ArithmeticException ae){
            System.out.println("Got ArithmeticException");
        } catch (NullPointerException npe){
            System.out.println("Got NullPointerException ");
        } catch (ArrayIndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("Got ArrayIndexOutOfBoundsException ");
        } finally {
            System.out.println("This code will always gets executed " +
                    "whether exception occurs or not? ");
        }



        try {
            System.out.println("Try block");
        } finally {
            System.out.println("Finally block ");
        }
    }
}
