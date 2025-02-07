package ca.sheridancollege.bhindeak.onlinebookstore.models;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookList {
    private List<Book> availableBooks;

    public BookList() {
        availableBooks = new ArrayList<>();
        availableBooks.add(new Book("960518", "Introduction to Java Language","kathy sierra and Bert Bates", 12.0));
        availableBooks.add(new Book("9738042", "Introduction to Spring Boot", "Joshua Bloch", 15.0));
        availableBooks.add(new Book("939943", "Introduction to Spring MVC", "Cay S. Horstmann", 20.0));
        availableBooks.add(new Book("284722", "Introduction to C", "Kathy Sierra", 25.0));
        availableBooks.add(new Book("807613", "Introduction to C++", "Bruce Eckel", 30.0));
        availableBooks.add(new Book("105293", "Introduction to C#", "Brian Goetz", 40.0));
        availableBooks.add(new Book("626266", "Introduction to Python", "Elisabeth Robson", 50.0));
        availableBooks.add(new Book("642267", "Introduction to HTML5", "Y. Daniel Liang", 60.0));
        availableBooks.add(new Book("103750", "Java for Beginners", "Eric Freeman", 70.0));
        availableBooks.add(new Book("429420", "HTML for Beginners", "Herbert Schildt", 80.0));

    }

    public List<Book> getAvailableBooks() {
        return availableBooks;
    }
}
