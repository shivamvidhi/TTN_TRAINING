package java2.question1;

import java.util.List;

public class BookItem extends Book {
    Author author;
    String issuedOn;
    String expiredOn;

    public BookItem(String name, Long id, Category category, String ISBN, List<Author> authorList) {
        super(name, id, category, ISBN, authorList);
    }

    

    public String getIssuedOn() {
        return issuedOn;
    }

    public void setIssuedOn(String issuedOn) {
        this.issuedOn = issuedOn;
    }

    public String getExpiredOn() {
        return expiredOn;
    }

    public void setExpiredOn(String expiredOn) {
        this.expiredOn = expiredOn;
    }

    boolean isBlocked;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}