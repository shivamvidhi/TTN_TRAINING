package com.shivam.PatientAppointment.Assignment.ManyToMany.Entity;

import javax.persistence.*;

@Entity
public class Subject_3 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;

    @ManyToOne
    Author_3 author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
