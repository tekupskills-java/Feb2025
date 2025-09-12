package StringClass;

public class StringHashCodeTest {
    //Hashcode is like unique id of an Object

    //hashcode
    //memory address


  /*  @Override
    public int hashCode() {
        return 100001;
    }*/

    int age;
    String name;

    StringHashCodeTest(){

    }

    StringHashCodeTest(int age1, String name1){
        this.age = age1;
        this.name = name1;
    }

    public static void main(String[] args) {
        StringHashCodeTest obj = new StringHashCodeTest(200, "Java");
        System.out.println("Hashcode of obj is "+obj.hashCode());

        StringHashCodeTest obj1 = new StringHashCodeTest(200, "Java");
        System.out.println("Hashcode of obj1 is "+obj1.hashCode());

        String s = "Java";   //SCP   (Perm Gen)
        System.out.println("Hashcode of s is "+s.hashCode());

        String s1 = new String("Java");   //Heap => YG
        s1 = null;    //that object becomes eligible for Garbage collection
        System.gc();    //OS  => scheduler
        System.out.println("Hashcode of s1 is "+s1.hashCode());

        boolean t = (s == s1);
        System.out.println("Result is "+t);   //false
    }
}
