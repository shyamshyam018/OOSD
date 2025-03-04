package com.library.services;
import com.library.database.BookDAO;
import com.library.models.Book;
import com.library.models.User;

public class BookService {
    private BookDAO bookDAO;
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
    public void displayBooks() {
        List<Books> books = bookDAO.getAllBooks();
        System.out.println("\nAvailable Books : ");
        for(Book book : books) {
            System.out.println(book);
        }
    }
    public void borrowBook(int bookId , User user) {
        if(bookDAO.borrowBook(bookId,user)){
            System.out.println("Book Borrowed Successfully");
        }else{
            System.out.println("Book Not Borrowed Successfully");
        }
    }
    public void returnBook(int bookId , User user) {
        if(bookDAO.returnBook(bookId,user)) {
            System.out.println("Book Returned Successfully");
        }else{
            System.out.println("Book Not Returned Successfully");
        }
    }
}
