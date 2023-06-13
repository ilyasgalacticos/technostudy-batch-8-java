package libraryproject;

public class Book implements BookData{

    private String title;
    private String author;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getData() {
        return this.title + " - " + this.author;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString(){
        return this.title + " - " + this.author;
    }
}
