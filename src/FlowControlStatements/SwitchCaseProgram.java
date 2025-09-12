package FlowControlStatements;

public class SwitchCaseProgram {

    public static void main(String[] args) {
        //days in a week  7 8
        //months in a year 12  13/14
        //

        //XXL = 48
        //XL = 46
        //L = 42-44
        //M = 40-42
        //S = 36-40
        //XS = 30-36
        //T-shirt size is

        // day and color code
        //day 1  = red
        //day 2 = yellow

        //day 9 = purple
        //Spoon  => regular fork

       /* int tShirtSize = 34;
        
        if(tShirtSize >= 48){
            System.out.println("T-shirt size is XXL");
        } else if (tShirtSize >= 46 && tShirtSize < 48) {
            System.out.println("T-shirt size is XL");
        } else if (tShirtSize >= 42 && tShirtSize < 44) {
            System.out.println("T-shirt size is L");
        } else if (tShirtSize >= 40 && tShirtSize < 42) {
            System.out.println("T-shirt size is M");
        }  else if (tShirtSize >= 36 && tShirtSize < 40) {
            System.out.println("T-shirt size is S");
        }  else if (tShirtSize >= 30 && tShirtSize < 36) {
            System.out.println("T-shirt size is XS");
        } else {
            System.out.println("Please provide valid tshirt size");
        }*/

        int dayNumber = -1;
        switch (dayNumber){
            case 1:
                System.out.println("Wear red color dress");
                break;
            case 2:
                System.out.println("Wear yellow color dress");
                break;
            case 3:
                System.out.println("Wear blue color dress");
                break;
            case 4:
                System.out.println("Wear grey color dress");
                break;
            case 5:
                System.out.println("Wear black color dress");
                break;
            case 6:
                System.out.println("Wear white color dress");
                break;
            case 7:
                System.out.println("Wear green color dress");
                break;
            case 8:
                System.out.println("Wear mustard color dress");
                break;
            case 9:
                System.out.println("Wear orange color dress");
                break;
            default:
                System.out.println("Wear dress of your choice");
        }

    }
}
