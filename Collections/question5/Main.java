package Collections.question5;

import java.util.*;

public class Main implements Comparable<employee>{
    public static void main(String[] args) {

        employee a =new employee(1.0,1.0,"A");
        employee b =new employee(1.2,1.2,"B");
        employee c =new employee(1.1,1.1,"C");

        List<employee> list = new ArrayList<employee>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list, new Comparator<employee>() {
            @Override
            public int compare(employee emp1, employee emp2) {
                if(emp1.getSalary() > emp2.getSalary())
                    return 1;
                else if(emp1.getSalary()<emp2.getSalary())
                    return -1;
                else
                    return 0;
            }
        });
        for(employee emp:list)
        {
            System.out.println(emp.getName()+"   "+emp.getAge()+"   "+emp.getSalary());
        }

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(employee employee) {
        return 0;
    }
}
