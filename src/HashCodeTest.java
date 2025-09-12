import java.util.Optional;

public class HashCodeTest {

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public HashCodeTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        HashCodeTest t1 = new HashCodeTest("Java", 30);
        System.out.println("Hashcode before updating object "+t1.hashCode());

        t1.setAge(50);
        System.out.println("Hashcode after updating object "+t1.hashCode());

       /* Optional<HashCodeTest> t = null;

        if(t.isPresent()){
            System.out.println("testt");
        }*/

    }


}
