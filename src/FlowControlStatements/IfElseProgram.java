package FlowControlStatements;

public class IfElseProgram {

    public static void main(String[] args) {
        int age = 17;
        //if age is greater than 18 print message that you can vote
        //if age is less than 18 print message that you can not vote

        if(age > 18){
            System.out.println("You can vote");
        }

        if(age < 18){
            System.out.println("You can not vote");
        }

        if(age > 18){
            System.out.println("You can vote");
        } else {
            System.out.println("You can not vote");
        }

        //if its raining open umbrella else do  not open it

        boolean isItRaining = true;

        if(isItRaining){
            System.out.println("Oen your umbrella");
        } else {
            System.out.println("Its not raining so we don't need umbrella");
        }
    }
}
