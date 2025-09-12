package ArrayProgramming;

public class ArraySortingProgram {

    public static void main(String[] args) {
        int[] array = {30,10,90,20,60,40,50,80,70};
        // 30 10 90 20 60 40 50 80 70 10
        // 0  1  2  3  4  5  6  7  8  9
        //descending largest to smallest   10 9 8 7 6 5 4 3 2 1
        //ascending   smallest to largest  1 2 3 4 5 6 7 8 9 10

        //interview try to avoid inbuilt java methods
        //loops
        //algorithms   => steps follow to get some output    bubble linear selection merge

        //
        for(int i = 0; i < array.length; i++){
                //i = 0  30
                //i = 2
            for(int j = i + 1; j < array.length; j++){   //9
                //j = 1   10
                // 10 30 90 20 60 40 50 80 70
                // 0  1  2  3  4  5  6  7  8

                // 10 20 90 30 60 40 50 80 70
                // 0  1  2  3  4  5  6  7  8

                // 10 20 30 90 60 40 50 80 70
                // 0  1  2  3  4  5  6  7  8

                // 10 20 30 60 90 40 50 80 70
                // 0  1  2  3  4  5  6  7  8

                // 10 20 30 40 90 60 50 80 70
                // 0  1  2  3  4  5  6  7  8

                // 10 20 30 40 60 90 50 80 70
                // 0  1  2  3  4  5  6  7  8

                // 10 20 30 40 50 90 60 80 70
                // 0  1  2  3  4  5  6  7  8

                // 10 20 30 40 50 60 90 80 70
                // 0  1  2  3  4  5  6  7  8

                // 10 20 30 40 50 60 80 90 70
                // 0  1  2  3  4  5  6  7  8

                // 10 20 30 40 50 60 70 90 80
                // 0  1  2  3  4  5  6  7  8

                // 10 20 30 40 50 60 70 80 90
                // 0  1  2  3  4  5  6  7  8

                int temp = 0;
                if(array[i] > array[j]){   //i = 8   j = 9        30 > 10    0 = 10  1 = 30
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println("Element present at index after copying elements " + i + "  is "+array[i]);
        }

    }
}
