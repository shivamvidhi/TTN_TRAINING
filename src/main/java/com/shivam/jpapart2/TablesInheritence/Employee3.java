package com.shivam.jpapart2.TablesInheritence;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "emp_type",discriminatorType = DiscriminatorType.STRING)
public abstract class Employee3 {
    public Employee3(long id, int salary) {
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

    public Employee3() {
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
