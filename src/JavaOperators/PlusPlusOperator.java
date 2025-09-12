package JavaOperators;

public class PlusPlusOperator {

    public static void main(String[] args) {
        // post increment    Uses value first, then increments.
        int a = 10;
        System.out.println("doing post increment "+a++); // 10
        System.out.println("actual result "+a);  //11

        // pre increment    Increments first, then uses value.
        int b = 10;
        System.out.println("doing pre increment "+(++b)); // 11
        System.out.println("actual result "+b);  //10  11

     /*   int a = 10;
        a++;   // post increment    Uses value first, then increments.
        ++a;  //pre increment       Increments first, then uses value.*/

      /*  //++
        int a = 100;
        System.out.println(a);  //100
        a =  100 + 1;
        System.out.println(a);  //101

        int b = 200;
        System.out.println(b); //200
        b = b - 1;
        System.out.println(b); //199*/
    }
}
