package shopping;

public enum Genre {

    HORROR("Horror"),
    FICTION("Fiction"),
    BIOGRAPHY("Biography"),
    COMEDY("Comedy"),
    THRILLER("Thriller"),
    MYSTERY("Mystery"),
    NOVEL("Novel");

    private String genre;

    Genre(String genre){
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

}
