
/*
Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get
 the instance of the Class using constructor reference
 */
package question_4;


@FunctionalInterface
interface EmployeeI {
    Employee getDetails(String name, int age, String city);
}

public class Main {
    public static void main(String[] args) {
        EmployeeI e = Employee::new;
        System.out.println( e.getDetails("shivam", 21, "Meerut").getName());

        EmployeeI f = Employee::new;
        System.out.println( f.getDetails("Mayank", 21, "Meerut").getName());

        EmployeeI g = Employee::new;
        System.out.println( g.getDetails("Vinod", 21, "Meerut").getName());

    }
}
