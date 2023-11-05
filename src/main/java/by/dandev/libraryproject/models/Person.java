package by.dandev.libraryproject.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class Person {


    private int id;

    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, [A-Z]\\w+",
    message = "Full name should be in following format: Name, Surname, Second name")
    private String fullName;

    @NotEmpty(message = "Year of birth should not be empty")
    @Min(value = 1900, message = "Year of birth should be greater than 1900")
    private int yearOfBirth;

    public Person() {

    }

    public Person( String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
