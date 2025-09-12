package ExceptionHandling;

public class SingleTryMultipleCatch {

    public static void main(String[] args) {

        try{
            int a = 100 / 10;    //Arithmetic
            int[] arr = new int[10];    //0 - 9
            arr[1] = 100;   //AIOB
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
        } catch (RuntimeException re){
            System.out.println("Got Runtime exception ");
        }  catch (Exception ex){
            System.out.println("Got generic exception ");
        }

        System.out.println("Test message printed");
    }

    void dummy(){
        System.out.println("Dummy method ");
    }
}
