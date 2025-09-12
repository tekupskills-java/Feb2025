package Encapsulation;

public class IntroToEncapsulation {

    // JUnit => java class => 1000 => Junit  10-20 mins
    //Loan => Java
    //Fraud detection  => Category Cibil  => loan

    //What is encapsulation=>
    //In encapsulation, we bind variables and methods in single unit called class.

    //How do we achieve it?
    //By making attributes/variables private and to access those private members we provide
    //public setters and getters method.

        //what are oops concepts and explain them?

    //Usage of OOPS concepts in your application?

    //interfaces more than abstract class
    //lombok  => setters and getters


    //public => station bus stand
    //private  => home

    private int atmPin;

    public int getAtmPin() {
        return atmPin;
    }

    public void setAtmPin(int atmPin) {
        if(atmPin >= 0){
            throw new RuntimeException("Atm pin must be greater than 0");
        }
        this.atmPin = atmPin;
    }
}

class TestEncapsulation {

    public static void main(String[] args) {
        IntroToEncapsulation encapsulation = new IntroToEncapsulation();
        encapsulation.setAtmPin(0);
        int atm = encapsulation.getAtmPin();
        System.out.println("Atm pin is "+atm);


    }
}
