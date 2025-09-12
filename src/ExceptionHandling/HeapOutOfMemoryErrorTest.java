package ExceptionHandling;

public class HeapOutOfMemoryErrorTest {
    public static void main(String[] args) {

        int[] largeArray = new int[Integer.MAX_VALUE - 2];

        //GC  => automatic  System.gc();   => no guarantee

      /*  try {
            // Attempt to allocate a very large array.
            int[] largeArray = new int[Integer.MAX_VALUE - 2]; // Max array size is limited
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
        }*/
    }
}
