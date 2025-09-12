package ExceptionHandling;

public class WhyExceptionHandlingIsNeeded {

    //10 checked exceptions => root cause => why we got that exception   => how to fix it?

    public static void main(String[] args) {

        WhyExceptionHandlingIsNeeded obj = new WhyExceptionHandlingIsNeeded();
        obj = null;
       // obj.dummy();   //NPE
        try{
            obj.dummy();   //NPE
        } catch (Exception ex) {
            System.out.println("We got an exception.");
        }

        System.out.println("Test line ");


        try{
            int a = 100 / 0;
        } catch(Exception ee){
            System.out.println("We got an another exception.");
        }
    }

    void dummy(){
        System.out.println("Dummy method of class WhyExceptionHandlingIsNeeded ");
    }
}
