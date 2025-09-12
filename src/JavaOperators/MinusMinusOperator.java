package JavaOperators;

public class MinusMinusOperator {

    //Git    => Source version control
    //7/12   =>
    // Code quality check => SonarCube

    public static void main(String[] args) {
      /*  a--;   // post increment    Uses value first, then decrements.
        --a;  //pre increment       decrements first, then uses value.*/

        // post decrement    Uses value first, then decrement.
        /*int a = 10;
        System.out.println("doing post increment "+(a--)); // 10
        System.out.println("actual result "+a);  //9

        // pre decrement    decrement first, then uses value.
        int b = 10;
        System.out.println("doing pre increment "+(--b)); // 9
        System.out.println("actual result "+b);  //9*/

       /* int c = 100;
        System.out.println((c++));  //100   101   c =  100
        System.out.println((--c));  //100  98 99 c = 101 c = 100
        */

        int  d = 100;
        System.out.println((--d) - (++d));   // 100 0 -1  1  -2
    }
}
