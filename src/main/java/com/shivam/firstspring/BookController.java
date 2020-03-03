package com.shivam.firstspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BookController {
    @GetMapping("/Book")
    public List<Book> getBooks()
    {
        return Arrays.asList(new Book(1,"shiavm"));
    }

}
