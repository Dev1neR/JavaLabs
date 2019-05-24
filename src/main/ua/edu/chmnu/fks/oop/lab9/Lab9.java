/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop.lab9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Dev1ne
 */
public class Lab9 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String filename = "out.txt";
        String search = "Petya";
        ArrayList<Employees> empl = new ArrayList<Employees>();
//        Employees empl1 = new Employees(
//                "Vasya",
//                21,
//                4000
//        );
//        Employees empl2 = new Employees(
//                "Vasya",
//                39,
//                5000
//        );
//        Employees empl3 = new Employees(
//                "Dasya",
//                31,
//                2000
//        );
        empl.add(new Employees("Vasya",21,4000));
        empl.add(new Employees("Petya",30,5000));
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(empl);
            System.out.println("File has been written\n");
        }
        
        ArrayList<Employees> searchedEmpl = new ArrayList<Employees>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            searchedEmpl = ((ArrayList<Employees>)(in.readObject()));
        }
        for(Employees e : searchedEmpl) {
            if(e.getName().equals(search)) {
            System.out.println("Restored data: " + e.getName() +", " +e.getAge()+", "+e.getSalary());
            }
        }
    }  
}
