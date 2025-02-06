package ca.sheridancollege.bhindeak.onlinebookstore.controllers;

import ca.sheridancollege.bhindeak.onlinebookstore.models.BookList;
import ca.sheridancollege.bhindeak.onlinebookstore.models.BookCartList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    private BookList bookList = new BookList();
    private BookCartList bookCartList = new BookCartList();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("books", bookList.getAvailableBooks());
        return "index";
    }
}