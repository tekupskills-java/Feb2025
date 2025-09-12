package JavaOperators;

public class LogicalOperators {

    /*Conditional operators are:

            &&, Logical AND: returns true when all conditions are true.
            ||, Logical OR: returns true if at least one condition is true.
            !, Logical NOT: returns true when a condition is false and vice-versa*/

    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 40;
        int d = 20;

        boolean t1 = (a < b && b < c && d > c);   // false
        System.out.println("Value of t1 is "+t1);

        boolean t3 = (!t1);
        System.out.println("Value of t3 is "+t3);  //true

        boolean t2 = (a > b || b < c || d > c);  //

        System.out.println("Value of t2 is "+t2);  //true

        boolean t4 = (!t2);
        System.out.println("Value of t4 is "+t4); //false

    }
}
