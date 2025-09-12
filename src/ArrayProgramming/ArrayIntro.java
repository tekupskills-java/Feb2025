package ArrayProgramming;

public class ArrayIntro {
    public static void main(String[] args) {
        int a = 10; //this variable

        //multiple values store in single variable

        //syntax creations
        //1 syntax

        //Array is indexed based Data structure
        //datatype[] arrayName = new datatype[size];
        int[] array = new int[10];    //
        array[0] = 200;
        array[1] = 20;
        array[2] = 400;
        array[3] = 900;
        array[4] = 400;
        array[5] = 600;
        array[6] = 200;
        array[7] = 200;
        array[8] = 500;
        array[9] = 500;

        System.out.println("Print values "+array.length);   //10  1 - 10   0 - 9


        //2 syntax
        // //datatype[] arrayName = {values specify};
        int[] array1 =  {10,20,30,40,50,50,70,80,90,10};
        System.out.println("Size of array1 is "+array1.length);  //10    0 - 9    starting index 0
                                                                                // last index 9
        System.out.println("Element present at 0 index is "+array1[1]);  //20

        //how to add or remove elements from an array

        String[] names = {"Java", "Program", "Development"};

        long ll = 989888889;
        float fl = 99999988999999.0f;

        short s = 100;
        int b = s;    //widening  //casting  converting 1 data type into another

        int c = 1231231233;   //short 32767
        short d = (short) c;   // narrowing

        //pass by value
        //pass by reference
        //even for non-primitive  we pass that reference as value
    }
}
