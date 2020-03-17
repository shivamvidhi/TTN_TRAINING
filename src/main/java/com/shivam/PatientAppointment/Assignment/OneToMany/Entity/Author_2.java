package com.shivam.PatientAppointment.Assignment.OneToMany.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author_2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    @Embedded
    Address_2 address2;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    List<Subject_2> subject2List;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    List<Book_2> book2;

    public List<Subject_2> getSubject2List() {
        return subject2List;
    }

    public void setSubject2List(List<Subject_2> subject2List) {
        this.subject2List = subject2List;
    }

    public List<Book_2> getBook2() {
        return book2;
    }

    public void setBook2(List<Book_2> book2) {
        this.book2 = book2;
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

    public Address_2 getAddress2() {
        return address2;
    }

    public void setAddress2(Address_2 address2) {
        this.address2 = address2;
    }
}
