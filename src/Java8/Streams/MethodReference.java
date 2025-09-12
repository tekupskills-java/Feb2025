package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodReference {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

/*
        //static method
        list.stream()
                .map(Integer::parseInt).
                forEach(e -> System.out.println("Element is "+e));
*/

        List<String> stringList = new ArrayList<>();

        stringList.add("ABCDE");
        stringList.add("OKKKKOO");
        stringList.add("ASD");
        stringList.add("TWERRWERWE");
        stringList.add("ABCDE");
        stringList.add("WERW");
        stringList.add("KGFD");
        stringList.add("OPPO");
        stringList.add("ABC");
        stringList.add("DEF");

       /* stringList.stream()
                .map(String::toLowerCase).
                forEach(e -> System.out.println("Element is "+e));*/


       // Company c = new Company("My_Company", 999999999);

        //Calling getName() of c using lambda

      /*  Supplier<Double> lambdaSupplier = () -> c.getSalary();
        System.out.println(lambdaSupplier.get());  //My_Company  999999999

     //   Company c = new Company("Java", 10000000);
        Supplier<Double> lambdaSupplier1 = c::getSalary;
        System.out.println(lambdaSupplier1.get());*/

        Supplier<Company> lambdaSupplier = () -> new Company("Java", 12222222);
        lambdaSupplier.get();

        //Creating objects using constructor references

      /*  Supplier<Company> referenceSupplier = Company::new;
        referenceSupplier.get();*/

    }

    /*void test(){
        Company c = new Company("Java", 10000000);
        Supplier<Double> lambdaSupplier1 = c::getSalary;
        System.out.println(lambdaSupplier1.get());  //My_Company  999999999
    }*/

}

/*class Company
{

}*/


class Company
{
    String name;
    double salary;

    public Company(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary(){
        return salary;
    }
}
