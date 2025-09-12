package Contructor;
//When developer writes a Parameterized Constructor
// then JVM will not provide you no-arg constructor in class.
public class DevWritesConstructor {

    DevWritesConstructor(int a, int b){
        System.out.println("Parameterized Constructor");
    }

    DevWritesConstructor() {

    }

    public static void main(String[] args) {
        DevWritesConstructor obj = new DevWritesConstructor();
    }
}
