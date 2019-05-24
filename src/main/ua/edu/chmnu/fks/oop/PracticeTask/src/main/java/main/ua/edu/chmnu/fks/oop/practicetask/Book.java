/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop.practicetask;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Dev1ne
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class Book implements Serializable{
    private String isbn;
    private String author;
    private String title;
    private Date date;
    private int pages;   

    @Override
    public String toString() {
        return "\nBook: \n" + "ISBN: " + isbn + "\nAuthor: " + author + "\nTitle: " + title + "\nDate: " + date + "\nPages: " + pages;
    }
    
}
