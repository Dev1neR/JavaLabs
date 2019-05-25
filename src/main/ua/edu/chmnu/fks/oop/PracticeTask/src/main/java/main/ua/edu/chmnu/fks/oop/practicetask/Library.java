/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop.practicetask;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dev1ne
 */
public class Library implements LibActions {

    private static Library library;
    private static ArrayList<Book> books;
    static String filename = "BookLibrary.txt";

    public Library() {
        books = new ArrayList<>();
    }

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void saveToFile(String filename) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename, false);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                ObjectOutputStream oos = new ObjectOutputStream(bufferedOutputStream)) {
            oos.writeObject(books);
        } catch (IOException e) {
            System.out.println("Something went wrong while saving");
        }
    }

//    public void appendToFile(String filename) {
//        try (FileOutputStream fileOutputStream = new FileOutputStream(filename, true);
//                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//                ObjectOutputStream oos = new ObjectOutputStream(bufferedOutputStream)) {
//            oos.writeObject(books);
//        } catch (IOException e) {
//            System.out.println("Something went wrong while saving");
//        }
//    }

    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(filename);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                ObjectInputStream ois = new ObjectInputStream(bufferedInputStream)) {
            setBooks((ArrayList<Book>) ois.readObject());
        } catch (IOException e) {
            System.out.println("Something went wrong while loading");
        }
    }

    @Override
    public List<Book> getByISBN(String isbn) {
        return books.stream().filter(b -> (b.getIsbn() == null ? isbn == null : b.getIsbn().equals(isbn))).collect(Collectors.toList());
    }

    @Override
    public List<Book> getByAuthor(String author) {
        return books.stream().filter(b -> (b.getAuthor() == null ? author == null : b.getAuthor().equals(author))).collect(Collectors.toList());
    }

    @Override
    public List<Book> getByDate(Date date) {
        return books.stream().filter(b -> b.getDate().getDate() == date.getDate()).collect(Collectors.toList());
    }

    @Override
    public List<Book> getByPage(int from, int to) {
        return books.stream().filter(b -> b.getPages() >= from && b.getPages() <= to).collect(Collectors.toList());
    }
}
