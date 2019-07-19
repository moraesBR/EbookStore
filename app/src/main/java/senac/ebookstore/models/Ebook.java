package senac.ebookstore.models;

import java.util.ArrayList;
import java.util.List;

public class Ebook {
    private String title;
    private String urlImage;
    private List<String> authors;
    private String resume;
    private Genre genre;
    private String isbn;
    private boolean selected = false;

    public Ebook() {
        this.authors = new ArrayList<>();
    }


    public String getTitle() {
        return title;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getResume() {
        return resume;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public void addAuthor(String author) {
        if (!author.isEmpty())
            this.authors.add(author);
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return  "\n" + title +
                "\n" +  urlImage +
                "\n" + authors.toString() +
                "\n" + resume +
                "\n" + genre.toString() +
                "\n" + isbn;
    }
}
