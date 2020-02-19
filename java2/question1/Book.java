package java2.question1;

import java.util.ArrayList;
import java.util.List;



public abstract class Book extends BaseEntity {
    String ISBN;
    List<Author> authorList = new ArrayList<>();

    public Book(String name, Long id, Category category, String ISBN, List<Author> authorList) {
        super(name, id, category);
        this.ISBN = ISBN;
        this.authorList = authorList;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
}