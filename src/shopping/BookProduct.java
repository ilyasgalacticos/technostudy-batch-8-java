package shopping;

import shopping.Genre;
import shopping.Product;

public class BookProduct extends Product {

    private String publisher;
    private String author;
    private Genre genre;

    public BookProduct() {
        super();
    }

    public BookProduct(String name, int price, Category category, String publisher, String author, Genre genre) {
        super(name, price, category);
        this.publisher = publisher;
        this.author = author;
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String getData() {
        return "Book " + getName() + " "
                + getGenre().getName() + " written by "
                + getAuthor() + " "
                + ", published by " + getPublisher()
                + " costs " + getPrice() + " USD";
    }
}
