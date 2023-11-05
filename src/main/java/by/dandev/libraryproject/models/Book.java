package by.dandev.libraryproject.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Book {

    private int id;
    @NotEmpty(message = "Name of the book should not be empty")
    @Size(min = 1, max = 100, message = "Name of the book should be between 1 and 100 symbols")
    private String bookName;

    @NotEmpty(message = "Author of the book should not be empty")
    @Size(min = 1, max = 100, message = "Author of the book should be between 1 and 100 symbols")
    private String author;

    @NotEmpty(message = "Year of publishing should not be empty")
    private int year;

    public Book(String bookName, String author, int year) {

        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
