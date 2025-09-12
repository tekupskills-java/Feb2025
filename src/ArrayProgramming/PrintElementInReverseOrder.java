package ArrayProgramming;

public class PrintElementInReverseOrder {

    public static void main(String[] args) {
        int[] array =  {10,20,30,40,50,60,70,80};

        //10 20 30 40 50 60 70 80
        //0  1  2  3  4   5  6  7
        //array.length  = 8

        //initialization
        //condition
        //decrement
        for(int i = array.length - 1 ; i >= 0; i--){
            //i = 7 80
            //i = 6 70
            //i = 5 60

            //i = 0 10
            // i = -1     -1 > 0
            System.out.println("Element present at index " + i + "  is "+array[i]); //80 70 60 50 40 30 20 10
        }

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
