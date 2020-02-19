package java2.question1;

public class Author extends BaseEntity implements Account{

    public Author(String name,Long id,Category category) {
        super(name,id,category);
    }

    @Override
    public boolean passwordReset() {
        return false;
    }
}
