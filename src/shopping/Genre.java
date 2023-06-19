package shopping;

public enum Genre {

    HORROR("Horror"),
    FICTION("Fiction"),
    BIOGRAPHY("Biography"),
    COMEDY("Comedy"),
    THRILLER("Thriller"),
    MYSTERY("Mystery"),
    NOVEL("Novel");

    private String name;

    Genre(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
