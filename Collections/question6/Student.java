package Collections.question6;

public class Student {
    double age;
    double score;
    String name;
    public Student(double sc,String n, double a)
    {
        this.score=sc;
        this.name=n;
        this.age = a;
    }
    public double getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
