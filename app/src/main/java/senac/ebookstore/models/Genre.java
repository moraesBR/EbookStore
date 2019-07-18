package senac.ebookstore.models;

public enum Genre {
    NOVEL("Romance"),
    BUSSINESS("Negócios"),
    TECH("Técnico");

    private final String genre;

    private Genre(String genre){
        this.genre = genre;
    }
}
