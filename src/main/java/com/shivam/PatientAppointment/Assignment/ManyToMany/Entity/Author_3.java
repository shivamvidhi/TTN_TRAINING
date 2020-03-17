package com.shivam.PatientAppointment.Assignment.ManyToMany.Entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Author_3 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    @Embedded
    Address_3 address2;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    List<Subject_3> subject2List;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book",joinColumns = @JoinColumn(name = "author_3_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_3_id",referencedColumnName = "id"))

    List<Book_3> book2;

    public List<Subject_3> getSubject2List() {
        return subject2List;
    }

    public void setSubject2List(List<Subject_3> subject2List) {
        this.subject2List = subject2List;
    }

    public List<Book_3> getBook2() {
        return book2;
    }

    public void setBook2(List<Book_3> book2) {
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

    public Address_3 getAddress2() {
        return address2;
    }

    public void setAddress2(Address_3 address2) {
        this.address2 = address2;
    }
}
