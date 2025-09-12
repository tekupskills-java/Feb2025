package Encapsulation;

public class Indian {
    //140 crore

    private String name;
    private int age;
    private double salary;
    private String address;
    private int panCard;
    private long aadharCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPanCard() {
        return panCard;
    }

    public void setPanCard(int panCard) {
        this.panCard = panCard;
    }

    public long getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(long aadharCard) {
        this.aadharCard = aadharCard;
    }
}

class CreateUniqueIndians {
    public static void main(String[] args) {
        Indian sangram = new Indian();
        sangram.setName("Sangram Jadhav");
        sangram.setAge(23);
        sangram.setAddress("Sangli");
        sangram.setSalary(100000);
        sangram.setPanCard(123123123);
        sangram.setAadharCard(89899999);

        System.out.println("Get Sangram's details as Name is "+sangram.getName() + " Age is "+sangram.getAge() + " " +
                " And Salary is "+sangram.getSalary());

        sangram.setSalary(110000);


        Indian tejas = new Indian();
        tejas.setName("Tejas Mahadik");
        tejas.setAge(23);
        tejas.setAddress("Sangli");
        tejas.setSalary(110000);
        tejas.setPanCard(12333333);
        tejas.setAadharCard(87766666);

    }
}
