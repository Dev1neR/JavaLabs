package test.ua.edu.chmnu.fks.oop;

import main.ua.edu.chmnu.fks.oop.Lab4;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertEquals;

class Lab4Test {
    public Lab4Test() {
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
    public void testIsInside(){
        boolean a = Lab4.isInside(0, 0, 20, 0, 20, 30, 10, 15);
        assertEquals(true, a);
    }

    @Test
    public void testIsNotInside(){
        boolean a = Lab4.isInside(0, 0, 20, 0, 20, 30, 40, 55);
        assertEquals(true, a);
    }
}