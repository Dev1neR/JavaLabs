/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import main.ua.edu.chmnu.fks.oop.Employees;
import static main.ua.edu.chmnu.fks.oop.Lab9.read;
import static main.ua.edu.chmnu.fks.oop.Lab9.write;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dev1ne
 */
public class Lab9Test {

    public Lab9Test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testWrite() throws IOException {
        String filename = "out.txt";
        ArrayList<Employees> empl = new ArrayList<Employees>();
        empl.add(new Employees("Vasya", 21, 4000));
        empl.add(new Employees("Petya", 30, 5000));
        
        write(filename, empl);
        boolean exists = new File(filename).isFile();
        assertEquals(true, exists);
    }
    @Test
    public void testRead() throws IOException, FileNotFoundException, ClassNotFoundException {
        String filename = "out.txt";
        String search = "Petya";
        ArrayList<Employees> searchedEmpl = new ArrayList<Employees>();
        ArrayList<Employees> expected = new ArrayList<Employees>();
        expected.add(new Employees("Petya", 30, 5000));
        read(filename, searchedEmpl, search);
        assertDoesNotThrow(() -> read(filename, searchedEmpl, search));
    }
}
