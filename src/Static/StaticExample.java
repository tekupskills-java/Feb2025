package Static;


public class StaticExample {
    static int var1 = 10;  //static   vs   final
    int var2 = 10;         //instance

    public static void main(String[] args) {
// Let's create two instances of StaticExample
        StaticExample object1 = new StaticExample();
        object1.var1 = 20;
        object1.var2 = 20;

        //For Instance variable, each object gets his own copy/value but all objects share same Copy/value of static variable.
        StaticExample object2 = new StaticExample();
        object2.var1 = 30;
        object2.var2 = 30;

      /*  System.out.println("object1.var1 ttt " + object1.var1);  //20  30
        System.out.println("object1.var2 ttt " + object1.var2); //20

        System.out.println("object2.var1 uuuu " + object2.var1); //30
        System.out.println("object2.var2 uuuu " + object2.var2); //30*/

        /*System.out.println("object1.var1 ttt " + object1.var1); //
        System.out.println("object1.var2 tttt " + object1.var2); //

        System.out.println("object2.var1 ttt " + object2.var1); // Prints:  30   10
        System.out.println("object2.var2 tttt " + object2.var2); // Prints:  30   30*/


        StaticExample object3 = new StaticExample();
        object3.var1 = 40;
        object3.var2 = 40;
        System.out.println("object1.var1 ttt " + object1.var1); // Prints: 40
        System.out.println("object1.var2 tttt " + object1.var2); // Prints: 20

        System.out.println("object2.var1 ttt " + object2.var1); // Prints: 40
        System.out.println("object2.var2 tttt " + object2.var2); // Prints: 30

        System.out.println("object3.var1 ttt " + object3.var1); // Prints: 40
        System.out.println("object3.var2 tttt " + object3.var2); // Prints:  40


      /*  object1.var1 = 70;

        System.out.println("object1.var1 "+object1.var1); // Prints: 20 40  70
        System.out.println("object1.var2 "+object1.var2); // Prints: 20 20  20

        System.out.println("object2.var1 "+object2.var1); // Prints:40 70
        System.out.println("object2.var2 "+object2.var2); // Prints:30 30

        System.out.println("object3.var1 "+object3.var1); // Prints:40 70
        System.out.println("object3.var2 "+object3.var2); // Prints:40 40

        object1.var1 = 50;
        object1.var2 = 10;*/
        /*System.out.println(object2.var1); // Prints:
        System.out.println(object3.var1); // Prints:
        System.out.println(object2.var2); // Prints:
        System.out.println(object3.var2); // Prints:*/





       /* System.out.println(object1.staticInt); // Prints: 40
        System.out.println(object1.normalInt); // Prints: 20

        System.out.println(object2.staticInt); // Prints: 40
        System.out.println(object2.normalInt); // Prints: 30

        System.out.println(object3.staticInt); // Prints: 40
        System.out.println(object3.normalInt); // Prints: 40
*/
// We can see that increasing object2's staticInt
// increases it for object1 (and all current or future objects of that class)


    }

}
