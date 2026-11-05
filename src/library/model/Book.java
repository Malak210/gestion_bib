
package library.model;

public class Book implements Lendable {

    private final BookInfo info;
    private boolean borrowed;

    public Book(String title, String author) {
        this.info = new BookInfo(title, author);
        this.borrowed = false;
    }

    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
        }
    }

    public String getTitle() {
        return info.getTitle();
    }

    public String getAuthor() {
        return info.getAuthor();
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }
}
