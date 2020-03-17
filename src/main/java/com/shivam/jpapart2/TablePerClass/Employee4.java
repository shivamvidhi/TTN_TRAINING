package com.shivam.jpapart2.TablePerClass;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Employee4 {
    public Employee4(long id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    public Employee4() {
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
