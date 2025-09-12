package ExceptionHandling;


public class JavaMultipleCatchUsingPipe {
    public static void main(String[] args) {

        /*try {
            int array[] = null;
            array[100] = 30/0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOB "+e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }  catch (NullPointerException e) {
            System.out.println("NPE "+e.getMessage());
        }*/


        try {
            int array[] = null;
            array[10] = 300;
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException  e) {
            System.out.println(e.getMessage());
        }

        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
            Class class11 = Class.forName("ExceptionHandling.JavaMultipleCatchUsingPipe");
            JavaMultipleCatchUsingPipe obj = (JavaMultipleCatchUsingPipe) class11.newInstance();

        } catch (ArithmeticException  |
                ClassNotFoundException | InstantiationException | IllegalAccessException  e) {
            System.out.println(e.getMessage());
        }
    }
}
