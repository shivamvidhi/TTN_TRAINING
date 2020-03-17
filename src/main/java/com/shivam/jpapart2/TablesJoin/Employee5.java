package com.shivam.jpapart2.TablesJoin;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Employee5 {
    public Employee5(long id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee4{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    public Employee5() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    int salary;
}
