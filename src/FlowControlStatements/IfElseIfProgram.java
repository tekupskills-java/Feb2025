package FlowControlStatements;

public class IfElseIfProgram {

    public static void main(String[] args) {
        //Merit         marks > 90
        //First class   marks > 75 && marks < 90
        //Second class  marks > 45 && marks < 75
        //Fail          marks < 45

        //Size  = 36

        //XXL = 48
        //XL = 46
        //L = 42-44
        //M = 40-42
        //S = 36-40
        //XS = 30-36
        //T-shirt size is


        int marks = 75;

        if(marks >= 90){
            System.out.println("You are into Merit");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("First class");
        } else if (marks >= 35 && marks < 75){
            System.out.println("Second class");
        } else {
            System.out.println("Failed, try next year");
        }
    }
}
