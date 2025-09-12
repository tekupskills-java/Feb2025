package FlowControlStatements;

public class NestedIfElseProgram {

    public static void main(String[] args) {

        //leap year
        //odd even number
        //positive negative number
        //prime number
        //3 numbers find greatest of them    int a = 200; int b = 250; int c = 150;
        //swap 2 numbers using third variable and without third variable    int a = 20; int b = 30;    a = 30; b = 20;

        //It's raining or not? if not then do not plan any trek

        //If it's raining then check whether it's Sat or not

        //If it's Sat then we go for trek else we need to work on office tasks.

        boolean isItRaining = true;
        String dayOfWeek = "Mon";

        if(isItRaining){
            if(!dayOfWeek.equals("Sat")){
                System.out.println("Let's go to trek");
            } else {
                System.out.println("It's not a weekend, so i need to work on office tasks");
            }
        } else {
            System.out.println("Do not plan any trek ");
        }

    }
}
