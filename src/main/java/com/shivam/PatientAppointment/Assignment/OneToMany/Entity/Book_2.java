package com.shivam.PatientAppointment.Assignment.OneToMany.Entity;

import javax.persistence.*;

@Entity
public class Book_2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;

    @ManyToOne
    Author_2 author;

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

    public Author_2 getAuthor() {
        return author;
    }

    public void setAuthor(Author_2 author) {
        this.author = author;
    }
}
