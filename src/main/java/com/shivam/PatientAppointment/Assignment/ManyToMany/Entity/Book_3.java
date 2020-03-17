package com.shivam.PatientAppointment.Assignment.ManyToMany.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book_3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;

    @ManyToMany
    List<Author_3> author;

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

    public List<Author_3> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author_3> author) {
        this.author = author;
    }
}
