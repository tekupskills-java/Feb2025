package ArrayProgramming;

public class ArrayReverseOrderSorting {
    public static void main(String[] args) {
        int[] array = {30,10,90,20,60,40,50,80,70};
        // 30 10 90 20 60 40 50 80 70
        // 0  1  2  3  4  5  6  7  8
        //90 80 70 60 50 40 30 20 10

        //descending largest to smallest   10 9 8 7 6 5 4 3 2 1
        //ascending   smallest to largest  1 2 3 4 5 6 7 8 9 10

       /* for(int i = 0; i < array.length; i++){
            //i = 0  30
            //i = 2
            for(int j = i + 1; j < array.length; j++){
                int temp = 0;
                if(array[i] < array[j]){   //i = 8   j = 9        30 > 10    0 = 10  1 = 30
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }*/

       /* for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                int temp = 0;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }*/


        //reverse given array using 1 for loop

        for(int i = 0; i < array.length; i++){
            int max = i;
            for(int j = i +1; j < array.length; j++){
                if(array[j] > array[max]){
                    max = j;
                }
            }
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }


        //reverse given array in 1 more different way


        for(int i = 0; i < array.length; i++){
            System.out.println("Element present at index after copying elements " + i + "  is "+array[i]);
        }
    }
}
