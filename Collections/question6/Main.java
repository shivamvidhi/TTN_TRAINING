package Collections.question6;

import java.util.*;

public class Main  implements Comparable<Student>{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /*public static void main(String[] args) {
        Student a = new Student(25,"a",20);
        Student c = new Student(20,"c",20);
        Student b = new Student(20,"b",20);
        SortedSet<Student> set = new TreeSet<Student>();
        set.add(a);
        set.add(c);
        set.add(b);
        for(Student s:set) {
            System.out.println(s.getName());
        }
    }

    @Override
    public int compareTo(Student student) {
            // here we have to write the code and that code will be in Student Class
        return 0;
    }*/
   public static void main(String[] args) {
        Student a = new Student(25,"a",20);
        Student c = new Student(20,"c",20);
        Student b = new Student(20,"b",20);
        Map<Student, Integer> set = new TreeMap<Student, Integer>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getScore()<s2.getScore())
                    return 1;
                else if(s1.getScore()>s2.getScore())
                    return -1;
                else
                {
                    return(s1.getName().compareTo(s2.getName()));
                }

            }
        });
        set.put(a,1);
        set.put(c,1);
        set.put(b,1);
        for(Student s:set.keySet()) {
            System.out.println(s.getName()+"  "+s.getScore()+"  "+s.getAge());
        }
    }

    @Override
    public int compareTo(Student student) {
        return 0;
    }
}
