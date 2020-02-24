package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    String  name;
    int age;
    String city;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
class demo
{
    public static void main(String[] args) {
        Employee e1 = new Employee("shivam  Arora", 21, "meerut");
        Employee e2 = new Employee("Mayank", 21, "Noida");
        List<Employee> list =Arrays.asList(e1,e2);
        System.out.println(list.stream().sorted((o1,o2)-> o1.getName().length()-o2.getName().length())
                .collect(Collectors.toList()));

    }
}