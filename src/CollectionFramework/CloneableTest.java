package CollectionFramework;

public class CloneableTest {
}


class GFG  implements Cloneable{
    int x, y;

    // Constructor to initialize
    // object fields
    GFG() {
        x = 10;
        y = 20;
    }

    // Overriding the clone() method
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Returning a clone of the current object
        return super.clone();
    }
}

 class Main {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        GFG o1 = new GFG();

        // Cloning obj1 into obj2
        GFG o2 = (GFG) o1.clone();

        if(o2 instanceof Cloneable) {  //
            System.out.println("o2 instance of Cloneable");
        } else {
            System.out.println("o2 instance of Cloneable");
        }
        // let object cloned
        //else throw not supported exception

        System.out.println("o1: " + o1.x + " " + o1.y);
        System.out.println("o2: " + o2.x + " " + o2.y);
    }
}