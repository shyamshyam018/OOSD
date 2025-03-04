package com.library.models;
import java.util.ArrayList;
import java.util.List;

public class Member extends User {
    private List<Integer> borrowedBooks;
    public Member(String username, String password) {
        super(username,password,"Member");
        this.borrowedBooks = new ArrayList<>();
    }

    public List<Integer> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(int bookId) {
        borrowedBooks.add(bookId);
    }
    public void returnBook(int bookId) {
        borrowedBooks.remove(Integer.valueOf(bookId));
    }

    @Override
    public String toString() {
        return "Member: " + username + ", Borrowed Books: " + borrowedBooks;
    }
}
