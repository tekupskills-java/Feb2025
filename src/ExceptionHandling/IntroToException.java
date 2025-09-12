package ExceptionHandling;

public class IntroToException {

    //number / 0  =>
    public static void main(String[] args) {
        IntroToException obj = new IntroToException();
        int result  = obj.divide(100, 0);
        System.out.println("Divide method called "+result);
    }

    int divide(int a, int b){
        int c = a/b;
        return c;
    }
}
