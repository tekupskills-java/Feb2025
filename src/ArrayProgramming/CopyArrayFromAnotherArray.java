package ArrayProgramming;

public class CopyArrayFromAnotherArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 55, 65};
        int[] newArray = new int[arr.length];   //empty array

        for(int i = 0; i < newArray.length; i++){
            System.out.println("Element present at index before copying elements " + i + "  is "+newArray[i]);
        }

        for(int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];  //
        }
        //copy elements from arr to array
        System.out.println("===============");

        for(int i = 0; i < newArray.length; i++){
            System.out.println("Element present at index after copying elements " + i + "  is "+newArray[i]);
        }
    }
}
