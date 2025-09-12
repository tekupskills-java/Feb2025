package Java8.Streams;


import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private long salary;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, long salary, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
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

}

public class CollectorsClassMethods {

    public static void main(String[] args) {
        //groupby

        Employee saurabh = new Employee("Saurabh", "Chavan", 25, 90000, "Male");
        Employee ganesh = new Employee("Ganesh", "Shinde", 19, 75000, "Male");
        Employee nikita = new Employee("Nikita", "Dhangar", 24, 100000, "Female");
        Employee piya = new Employee("Piya", "Jadhav", 23, 120000, "Female");
        Employee reshma = new Employee("Reshma", "Mahadik", 21, 95000, "Female");
        Employee ganesh1 = new Employee("Garurav", "Mahadik", 27, 115000, "Male");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(saurabh);
        employeeList.add(reshma);
        employeeList.add(nikita);
        employeeList.add(ganesh);
        employeeList.add(piya);
        employeeList.add(ganesh1);


/*
        Map<String, List<Employee>>  map = employeeList.stream().
                collect(Collectors.groupingBy( e -> e.getGender()));

       map.entrySet().stream().
               forEach( entry -> System.out.println("Key is "+entry.getKey() +" Values are "+entry.getValue()));
*/

        //provided list of Employees, collect First Name of all Employees and store it in List

        //source, 1 or more intermediate ops and return result (terminal)

        /*List<String> firstNameList = employeeList.stream().
                map((Employee emp) -> emp.getFirstName()).
                sorted().
                collect(Collectors.toList());

        System.out.println("Print first name list "+firstNameList);*/

        //provided list of Employees, collect First Name of all Employees which are unique

        /*List<String> uniqueFirstNameList = employeeList.stream().
                map((Employee emp) -> emp.getFirstName()).
                sorted().
                distinct().
                collect(Collectors.toList());*/

       /* Set<String> uniqueFirstNameList1 = employeeList.stream().
                map((Employee emp) -> emp.getFirstName()).
                sorted().
                collect(Collectors.toSet());

        System.out.println("Print first name list "+uniqueFirstNameList1);*/

        //create a Map with FirstName as Key and Salary as Value
        /*Map<String, Long> map = employeeList.stream().
                collect(Collectors.toMap(e -> e.getFirstName(), e -> e.getSalary(), (v1, v2) -> v2) );


        map.entrySet().stream().forEach(entry ->
                System.out.println("Key is "+entry.getKey() + " and Value is "+entry.getValue()));*/

       /* List<String> cities = Arrays.asList("Mumbai", "Delhi", "Bangalore", "Chennai");

        // Joining elements into a single String
        String joinedCities = cities.stream().collect(Collectors.joining(":: "));

        System.out.println(joinedCities);*/

        /*List<Integer> pinCodes = Arrays.asList(123132, 143434, 123123, 123233, 3453454);
        pinCodes.stream().collect(Collectors.joining(":: "));
*/
        //duplicate Keys  => replace old Value with New Value
        //hash collision  => 2 different Keys

      /*  List<Integer> pinCodes = Arrays.asList(100, 200, 300, 50, 550);

       *//* int sum = pinCodes.stream().collect(Collectors.summingInt( i -> i));

        System.out.println("Sum is "+sum);  //1200*//*

        double avg = pinCodes.stream().collect(Collectors.averagingInt( i -> i));
        System.out.println("Average is "+avg);*/

        List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Akhil","deepak");

        // Grouping names by the first letter
        /*Map<Integer, List<String>> groupedByLetter = names.stream()
                .collect(Collectors.groupingBy(name -> name.length()));

        System.out.println(groupedByLetter);

        // Grouping names by the first letter
        Map<Character, List<String>> groupedByLetter1 = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupedByLetter1);*/

        /*List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

       List<Integer> list1 = listOfLists.stream().
               flatMap(list -> list.stream()).
               collect(Collectors.toList());
               //forEach(e -> System.out.println("Elements are "+e));

        System.out.println("list 1 elements are "+list1);*/
       //1 2 3 4 5 6 7 8

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Partitioning numbers into even and odd
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 != 0));

        System.out.println(partitioned);


    }
}
