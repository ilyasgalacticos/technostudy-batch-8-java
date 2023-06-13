package libraryproject;

public class Book implements BookData{

    private int id;
    private String title;
    private String author;

    public Book() {
    }

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getData() {
        return this.id + " - " + this.title + " - " + this.author;
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
        return this.getData();
    }
}
