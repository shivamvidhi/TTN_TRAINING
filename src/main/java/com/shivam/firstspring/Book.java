package com.shivam.firstspring;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Book {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

}
