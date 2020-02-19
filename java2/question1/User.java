package java2.question1;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseEntity implements Account {

    List<BookItem> bookItemList = new ArrayList<>();

    public User(String name, Long id, Category category, List<BookItem> bookItemList) {
        super(name, id, category);
        this.bookItemList = bookItemList;
    }

    public List<BookItem> getBookItemList() {
        return bookItemList;
    }

    public void setBookItemList(List<BookItem> bookItemList) {
        this.bookItemList = bookItemList;
    }

    @Override
    public boolean passwordReset() {
        return false;
    }
}