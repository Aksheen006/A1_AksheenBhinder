package ca.sheridancollege.bhindeak.onlinebookstore.models;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookCartList {
    private final List<Book> cartBooks;

    public BookCartList() {
        cartBooks = new ArrayList<>();
    }

    public void addBookToCart(Book book) {
        cartBooks.add(book);
    }

    public List<Book> getCartBooks() {
        return cartBooks;
    }

}
