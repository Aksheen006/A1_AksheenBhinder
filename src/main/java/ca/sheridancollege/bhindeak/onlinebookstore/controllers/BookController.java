package ca.sheridancollege.bhindeak.onlinebookstore.controllers;

import ca.sheridancollege.bhindeak.onlinebookstore.models.Book;
import ca.sheridancollege.bhindeak.onlinebookstore.models.BookList;
import ca.sheridancollege.bhindeak.onlinebookstore.models.BookCartList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {
    private final BookList bookList = new BookList();
    private final BookCartList bookCartList = new BookCartList();

    // Home Page
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // Available Books Page
    @GetMapping("/available_books")
    public String availableBooks(Model model) {
        model.addAttribute("books", bookList.getAvailableBooks());
        return "available_books";
    }

    // Shopping Cart Page
    @GetMapping("/shopping_books")
    public String shoppingCart(Model model) {
        model.addAttribute("cart", bookCartList.getCartBooks());
        return "shopping_books";
    }

    // Add a Book to the Cart
    @PostMapping("/add-to-cart/{isbn}")
    public String addToCart(@PathVariable String isbn) {
        for (Book book : bookList.getAvailableBooks()) {
            if (book.getBookISBN().equals(isbn)) {

                bookCartList.addBookToCart(book);
                break;
            }
        }
        return "redirect:/shopping_books";
    }

    // Checkout Page
    @GetMapping("/check_out")
    public String check_out() {
        return "check_out"; //
    }




}
