package ArrayProgramming;

public class OddEvenNumberCheck {
    public static void main(String[] args) {
        //number is divisible by 2 ===> even     2 4 6 8 10 22 24
        //number is not divisible by 2 ===> odd   5 3 17 27 33 35

        /*int y = 55;
        //remainder   => 0
        //remainder  => 1
        if(y % 2 == 0){
            System.out.println("y is even number");
        } else {
            System.out.println("y is odd number");
        }*/

        int[] array =  {32, 43, 44, 42, 65, 90, 88};
        //32 43 44 42 65 90 88
        //0  1  2  3  4  5   6

        for(int i = 0; i < array.length; i++){
            //32 % 2 => 0
            if(array[i] % 2 == 0){
                System.out.println("Value at index " + i + " is even number "+array[i]);    //32 44 42 90 88
            } else {
                System.out.println("Value at index " +i + " is odd number "+array[i]);   //43 65
            }
            //System.out.println("Element present at index " + i + "  is "+array[i]); //10 20 30 40 50 60 70 80
        }
    }
}
