package src.zad1.tpo6_mm_s24341;

import java.util.Date;

public class Book {
    int book_id;
    String title;
    String author;
    String description;
    String isbn;
    Date publishDate;
    int rating;
    Date creationDate;

    public Book(int book_id, String title, String author, String description, String isbn, Date publishDate, int rating, Date creationDate) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.isbn = isbn;
        this.publishDate = publishDate;
        this.rating = rating;
        this.creationDate = creationDate;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
