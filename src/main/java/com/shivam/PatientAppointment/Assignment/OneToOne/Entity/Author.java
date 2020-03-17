package com.shivam.PatientAppointment.Assignment.OneToOne.Entity;

import javax.persistence.*;

import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    @Embedded
    Address address;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    List<Subject> subjectList;

    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
    Book book;

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
