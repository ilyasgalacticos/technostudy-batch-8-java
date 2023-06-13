package libraryproject;

public class Magazine implements BookData {

    private String name;
    private String publisher;
    private String edition;

    public Magazine(){

    }

    public Magazine(String name, String publisher, String edition) {
        this.name = name;
        this.publisher = publisher;
        this.edition = edition;
    }

    @Override
    public String getData() {
        return this.name + " - " + this.edition + " published by " + this.publisher;
    }

    @Override
    public String getTitle() {
        return this.name;
    }

    @Override
    public String getAuthor() {
        return this.publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return getData();
    }
}
