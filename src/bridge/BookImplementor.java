package bridge;

public class BookImplementor implements MediaResourceImplementor {
    private Book book;
    public BookImplementor(Book book){
        this.book = book;
    }

    @Override
    public void snippet() {
        System.out.println("BookImplementor snippet: " + book.getDescription());
    }

    @Override
    public void url() {
        System.out.println("BookImplementor url: " + book.getName() + ".com");
    }

    @Override
    public void title() {
        System.out.println("BookImplementor title: " + book.getName());
    }

    @Override
    public void image() {
        System.out.println("BookImplementor image: " + book.getName() + ".jpg");
    }
}
