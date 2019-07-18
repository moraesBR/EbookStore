package senac.ebookstore.models;

public enum Genre {
    NOVEL("Romance"),
    BUSINESS("Negócio"),
    TECHNICIAN("Técnico");

    private final String genre;

    private Genre(String genre){
        this.genre = genre;
    }
}
