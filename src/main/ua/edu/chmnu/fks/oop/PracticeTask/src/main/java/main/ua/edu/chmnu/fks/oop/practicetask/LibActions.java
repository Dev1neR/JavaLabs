/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop.practicetask;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dev1ne
 */
public interface LibActions {

    public List<Book> getByISBN(String isbn);

    public List<Book> getByAuthor(String author);

    public List<Book> getByDate(Date date);

    public List<Book> getByPage(int from, int to);
}
