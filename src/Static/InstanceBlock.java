package Static;
/*
I want to execute some code once we create an object of a class
but before Constructor gets called.*/
public class InstanceBlock {
    {
        System.out.println("Instance block 1");
    }

    {
        System.out.println("Instance block 2");
    }

    InstanceBlock(){
        System.out.println("no-arg constructor ");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
    }
}
