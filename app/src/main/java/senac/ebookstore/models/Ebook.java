package senac.ebookstore.models;

import java.util.ArrayList;
import java.util.List;

public class Ebook {
    private String title;
    private String urlImage;
    private List<String> author;
    private String resume;
    private Genre genre;
    private String url;
    private String isbn;

    public Ebook() {
        this.author = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getUrl() {
        return url;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void addAuthor(String name) {
        author.add(name);
    }
}
