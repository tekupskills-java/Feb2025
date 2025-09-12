package ArrayProgramming;

public class ArrayElementItretion {

    public static void main(String[] args) {
        int[] array =  {10,20,30,40,50,60,70,80};
      //  System.out.println(array[8]);   //
        //length 6  8
        //starting index 0    0
        //last index     5    7
        //10000 elements
      /*  System.out.println("Element present at index 0 is "+array[0]); //10
        System.out.println("Element present at index 1 is "+array[1]); //20
        System.out.println("Element present at index 2 is "+array[2]); //30
        System.out.println("Element present at index 3 is "+array[3]); //40
        System.out.println("Element present at index 4 is "+array[4]); //50
        System.out.println("Element present at index 5 is "+array[5]); //60*/
        //10 20 30 40 50 60 70 80
        //0  1  2  3  4   5  6  7
        //array.length  = 8

        for(int i = 0; i < array.length; i++){
            //i = 0   10     0 < 8
            //i = 1   20     1 < 8
            //i = 2   30     2 < 8

            //i = 7   80
            //i = 8           8 < 8
            System.out.println("Element present at index " + i + "  is "+array[i]); //10 20 30 40 50 60 70 80
        }
    }
}
