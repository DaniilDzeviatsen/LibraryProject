package by.dandev.libraryproject.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Book {

    private int id;
    @NotEmpty(message = "Name of the book should not be empty")
    @Size(min = 1, max = 100, message = "Name of the book should be between 1 and 100 symbols")
    private String book_name;

    @NotEmpty(message = "Author of the book should not be empty")
    @Size(min = 1, max = 100, message = "Author of the book should be between 1 and 100 symbols")
    private String author;

    @NotEmpty(message = "Year of publishing should not be empty")
    private int year_of_publishing;

    public Book(int id, String book_name, String author, int year_of_publishing) {
        this.id = id;
        this.book_name = book_name;
        this.author = author;
        this.year_of_publishing = year_of_publishing;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear_of_publishing() {
        return year_of_publishing;
    }

    public void setYear_of_publishing(int year_of_publishing) {
        this.year_of_publishing = year_of_publishing;
    }
}
