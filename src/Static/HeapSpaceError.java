package Static;

import java.util.ArrayList;
import java.util.List;

public class HeapSpaceError {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        long i = 0;
        while (true) {
            list.add(new byte[1024 * 1024]); // Adding 1MB of data in each iteration
            i++;
            System.out.println("Allocated " + i + " MB");
        }
    }
}
