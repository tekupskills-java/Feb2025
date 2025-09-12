package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    private String firstName;
    private String lastName;
    private int age;
    private long salary;

    public Employee(){}

    public Employee(String firstName, String lastName, int age, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        //a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
        //return this.getAge() - o.getAge();
        return Math.toIntExact(this.getSalary() - o.getSalary());
    }
}


public class EmployeeSorting {

    public static void main(String[] args) {
        Employee saurabh = new Employee("Saurabh","Chavan",25,90000);
        Employee ganesh = new Employee("Ganesh","Shinde",19,75000);
        Employee nikita = new Employee("Nikita","Dhangar",24,100000);
        Employee piya = new Employee("Piya","Jadhav",23,120000);
        Employee reshma = new Employee("Reshma","Mahadik",21,95000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(saurabh);
        employeeList.add(reshma);
        employeeList.add(nikita);
        employeeList.add(ganesh);
        employeeList.add(piya);

        /*System.out.println("Before Sorting "+employeeList);

        Collections.sort(employeeList);

        System.out.println("After Sorting "+employeeList);*/

        employeeList.stream().sorted().
                forEach(element -> System.out.println("Elements with  is "+element));


    }
}
