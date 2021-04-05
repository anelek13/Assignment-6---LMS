package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.entity.Book;

import java.util.List;

public class BookService {
    public void addNewBook(String name, String authpr, boolean availablity){
        Book book = new Book();
        book.setTitle(name);
        book.setAuthpr(authpr);
        book.setAvailablity(availablity);
    }
    public void findBookByName(List<Book> bookList, String name){
        for(Book book : bookList){
            if(book.getTitle().equals(name))
                book.toString();
            else System.out.println("Book not found!");
        }
    }

    public void findBookByAuthor(List<Book> bookList, String author){
        for(Book book : bookList){
            if(book.getAuthpr().equals(author))
                book.toString();
            else System.out.println("Book not found!");
        }
    }
    public void findBookById(List<Book> bookList, int id){
        for(Book book : bookList){
            if(book.getId().equals(id))
                book.toString();
            else System.out.println("Book not found!");
        }
    }
}
