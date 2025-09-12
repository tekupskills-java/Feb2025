package ExceptionHandling;

public class IntroToCompileTime {

    public static void main(String[] args) {
        IntroToCompileTime obj = null;

        if (obj == null) {
            obj = new IntroToCompileTime();
        }

        obj.show();    //NPE     Runtime or unchecked

       // Class myClass = Class.forName("ExceptionHandling.IntroToCompileTime12");  //Checked exception
        try {
            Class myClass = Class.forName("ExceptionHandling.IntroToCompileTime");  //Checked exception
            /*IntroToCompileTime obj = null;

            *//*if(obj == null){
                obj = new IntroToCompileTime();
            }*//*
            obj.show();    //NPE     Runtime or unchecked*/
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } /*catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }*/


        /*try {
            Class myClass = Class.forName("ExceptionHandling.IntroToCompileTime");
            IntroToCompileTime obj = (IntroToCompileTime) myClass.newInstance();
            obj.show();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }*/
        // Object obj = myClass.newInstance();
    }

    void show(){
        System.out.println("Show method ");
    }
}
