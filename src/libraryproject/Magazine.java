package libraryproject;

public class Magazine implements BookData {

    private int id;
    private String name;
    private String publisher;
    private String edition;

    public Magazine(){

    }

    public Magazine(int id, String name, String publisher, String edition) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.edition = edition;
    }

    public Magazine(String name, String publisher, String edition) {
        this.name = name;
        this.publisher = publisher;
        this.edition = edition;
    }

    @Override
    public String getData() {
        return this.id + " - " + this.name + " - " + this.edition + " published by " + this.publisher;
    }

    @Override
    public String getTitle() {
        return this.name + " " + this.edition;
    }

    @Override
    public String getAuthor() {
        return this.publisher;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
