/*package ca.sheridancollege.bhindeak.onlinebookstore.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    // Getters and Setters
    private String bookISBN;
    private String bookTitle;
    private String bookAuthor;
    private Double bookPrice;

    // Constructor
    public Book(String bookISBN, String bookTitle, String bookAuthor, Double bookPrice) {
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }


}
*/

package ca.sheridancollege.bhindeak.onlinebookstore.models;

public class Book {
    private String bookISBN;
    private String bookTitle;
    private String bookAuthor;
    private Double bookPrice;

    // Constructor
    public Book(String bookISBN, String bookTitle, String bookAuthor, Double bookPrice) {
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    // Getter methods
    public String getBookISBN() {
        return bookISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    // Setter methods
    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }


}
