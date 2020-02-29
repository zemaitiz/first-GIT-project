package sdacademy.fundamentalscoding.practicalexcercises.bookAndAuthor;

import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private double price;
    private int qnt;

    public Book(String title, List<Author> authors, double price, int qnt) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public List getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQnt() {
        return qnt;
    }

    public String toString() {
        return String.format("Knygos pavadinimas: %s, %s", title, authors.get(0).toString());
    }
}

