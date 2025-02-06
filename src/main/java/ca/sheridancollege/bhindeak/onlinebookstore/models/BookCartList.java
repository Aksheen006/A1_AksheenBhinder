package ca.sheridancollege.bhindeak.onlinebookstore.models;

import java.util.ArrayList;
import java.util.List;

public class BookCartList {
    private List<Book> cartBooks;

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