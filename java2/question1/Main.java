package java2.question1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("shakespeare",100l,Category.AUTHOR);
        System.out.println(author.getName());
        System.out.println(author.getId());
        System.out.println(author.getCategory());

        author.passwordReset();

        Author author1 = new Author("Premchand",101l,Category.AUTHOR);
        System.out.println(author1.getName());
        System.out.println(author1.getId());
        System.out.println(author1.getCategory());


        Librarian librarian = new Librarian("Ram Prasad",102l,Category.LIBRARIAN);

        System.out.println(librarian.getName());
        System.out.println(librarian.getId());
        System.out.println(librarian.getCategory());

        List<Author> authors = new ArrayList<>();
        authors.add(author);
        authors.add(author1);

        BookItem bookItem = new BookItem("AS YOU LIKE IT",104L,Category.FICTION,"121212",authors);
        bookItem.setIssuedOn("2 feb 2020");
        bookItem.setExpiredOn("12 feb 2020");
        bookItem.setBlocked(true);

        System.out.println(bookItem.getName());
        System.out.println(bookItem.getCategory());
        System.out.println(bookItem.getId());
        System.out.println(bookItem.getAuthorList());

        System.out.println(bookItem.getIssuedOn());
        System.out.println(bookItem.getExpiredOn());
        System.out.println(bookItem.getExpiredOn());
        for(int i = 0; i < bookItem.getAuthorList().size(); i++) {
            System.out.println(bookItem.getAuthorList().get(i).getName());
        }



        System.out.println(bookItem.isBlocked());



    }
}