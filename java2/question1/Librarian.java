package java2.question1;

public class Librarian extends BaseEntity implements Account {

    public Librarian(String name,Long id,Category category){
        super(name,id,category);
    }

    public boolean isBlocked(BookItem bookItem) {
        return bookItem.isBlocked;
    }

    @Override
    public boolean passwordReset() {
        return false;
    }
}