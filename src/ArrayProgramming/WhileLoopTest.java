package ArrayProgramming;

public class WhileLoopTest {
    //When do not know no of iterations we use while loop

    //Database => Employee table  => 1000 employees =>

    public static void main(String[] args) {
        int[] array =  {10,20,30,40,50,60,70,80};
        int i = 0;
        int a = 0;
        //length = 8     0  -  7
        while(i > array.length){
            //0 < 8
            //1 < 8

            //7 < 8
            //8 < 8
            System.out.println("Element present at index " + i + "  is "+array[i]);
            i++;
        }

        do {
            System.out.println("Element present at index in case of do while " + a + "  is "+array[a]);
            a++;
        } while (a > array.length);

        System.out.println("================");

       /* int b = array.length - 1;  //8-1 = 7
        while (b >= 0){
            System.out.println("Element present at index in reverse order " + b + "  is "+array[b]);
            b--;
        }*/

    }
}
