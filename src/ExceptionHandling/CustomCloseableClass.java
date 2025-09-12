package ExceptionHandling;

public class CustomCloseableClass implements AutoCloseable{

    public static void main(String[] args) {

        try(CustomCloseableClass obj = new  CustomCloseableClass()){
            obj.test();
        } catch (Exception exception){
            System.out.println("Got into exception block ");
        }
        /*try{
            CustomCloseableClass obj = new  CustomCloseableClass();
            obj.test();
            obj.close();
        }catch (Exception exception){
            System.out.println("Got into exception block ");
        } finally {
            //close the resource
        }*/
    }

    void test(){
        System.out.println("Test method ");
    }

    @Override
    public void close() throws Exception {
        System.out.println("When this method will get called ?");
    }
}
