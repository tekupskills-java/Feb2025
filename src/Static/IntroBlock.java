package Static;

public class IntroBlock {

    //can i execute C++ code from Java?
    static int age = 1000;

    int test(){
        System.out.println("test is a method ");
        return 100;
    }

    static {
        System.out.println("static block 1");
        age = 2000;
    }

    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        System.out.println("Value of age is "+age);
        /*System.out.println("Main method ");
        IntroBlock block = new IntroBlock();
        block.test();*/
    }

    static {
        System.out.println("static block 2");
        age = 4000;
    }
}
