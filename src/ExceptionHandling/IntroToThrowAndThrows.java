package ExceptionHandling;

public class IntroToThrowAndThrows {
    //

    //class A.java    void test(){}
    //class B.java   call class A method from B class

     //compile both A and B   => A.class and B.class
     //delete A.class file and then run B class
    //classnotfoundexception and noclassdeffounderror

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        IntroToThrowAndThrows obj = new IntroToThrowAndThrows();
        obj.div(100, 10);
    }

    void div(int a, int b) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            ArithmeticException {

        if(b == 0){
            throw new ClassNotFoundException("Value of variable b is 0 and that's" +
                    "what causing this issue ");

            /*throw new NullPointerException("Value of variable b is 0 and that's" +
                    "what causing this issue ");*/
        }

        if(a == b){
            throw new NullPointerException("Value of variable b is 0 and that's" +
                    "what causing this issue ");
        }

        int c = a / b;
        System.out.println("Div is "+c);

        Class classZ = Class.forName("ExceptionHandling.IntroToThrowAndThrows");
        IntroToThrowAndThrows obj = (IntroToThrowAndThrows) classZ.newInstance();

       /* try{
            int c = a / b;
            System.out.println("Div is "+c);
        } catch (RuntimeException e){

        }*/

    }

    void test(){
        System.out.println("Test method");
    }

}
