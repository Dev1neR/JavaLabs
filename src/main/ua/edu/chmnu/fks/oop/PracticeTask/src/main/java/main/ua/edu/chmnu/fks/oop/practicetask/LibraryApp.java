/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop.practicetask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dev1ne
 */
public class LibraryApp {

    private static Library library;
    private static ArrayList<Book> books;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "BookLibrary.txt";
        
        library = new Library();
        books = new ArrayList<Book>();

        Book book1 = new Book(
                "978-0061124952",
                "E. B White",
                "Charlotte's Web",
                new Date("04/10/2012"),
                192
        );

        books.add(book1);
        Book book2 = new Book(
                "978-0651615454",
                "aa",
                "The Outsiders",
                new Date("05/21/1994"),
                274
        );

        books.add(book2);
        Book book3 = new Book(
                "978-1503290280",
                "J. M. Barrie",
                "Peter Pan",
                new Date("01/24/2019"),
                94
        );
        books.add(book3);
        Book book4 = new Book(
                "978-031615454",
                "aa",
                "The Siders",
                new Date("05/21/1994"),
                274
        );
        books.add(book4);
        library.setBooks(books);
//        library.getByAuthor(filename, books, "J. M. Barrie");     

        library.saveToFile(filename);
        library.loadFromFile(filename);        
        System.out.println(library.getByAuthor("aa").toString());
    }
}
