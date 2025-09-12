package ArrayProgramming;

public class ArraySwapPosition {

    public static void main(String[] args) {
        int[] arr = {60, 30};
        // 0 = 20    30
        // 1 = 30    20
        //arr[0] = 30;
       // arr[1] = 20;

        //if value of 0 index is greater than value of 1 index element swap the positions   => assignment

        //0 = 30
        //1 = 20

        int temp = 0;

        if(arr[0] > arr[1]){
            //arr[0] = 60;
            //arr[1] = 30;
            temp = arr[0];   //temp = 60
            arr[0] = arr[1]; //arr[0] = 30;
            arr[1] = temp;  //arr[1] = 60;

           /* temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;*/

            System.out.println("Swap the elements in given array ");
        } else {
            System.out.println("No need to swap elements ");
        }


        for (int i = 0; i < arr.length; i++){
            System.out.println("Element in array are "+arr[i]);
        }
    }
}
