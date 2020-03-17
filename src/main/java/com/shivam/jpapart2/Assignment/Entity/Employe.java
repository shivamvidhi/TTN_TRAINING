package com.shivam.jpapart2.Assignment.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {


    @Id
    int id;
    String fname;
    String lname;
    int salary;
    int age;


    public Employe()
    {

    }


    public Employe(int id, String fname, String lname, int salary, int age) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
