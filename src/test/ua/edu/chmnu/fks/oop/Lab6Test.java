/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static main.ua.edu.chmnu.fks.oop.Lab6.*;
import org.mockito.InOrder;
/**
 *
 * @author Dev1ne
 */
public class Lab6Test {
    
    public Lab6Test() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void getTypeTest() {
        PC perscomp = mock(PC.class);
        when(perscomp.getType()).thenReturn("Персональний комп'ютер");
        assertEquals("Персональний комп'ютер", perscomp.getType());
    }
    @Test
    public void getModelTest() {
        PC perscomp = mock(PC.class);
        when(perscomp.getModel()).thenReturn("Intel Core i5 4460");
        assertEquals("Intel Core i5 4460", perscomp.getModel());
    }
    @Test
    public void getCoresTest() {
        PC perscomp = mock(PC.class);
        when(perscomp.getCores()).thenReturn(4);
        assertEquals(4, perscomp.getCores());
    }
    @Test
    public void getChipsetTest() {
        PC perscomp = mock(PC.class);
        when(perscomp.getChipset()).thenReturn("1151");
        assertEquals("1151", perscomp.getChipset());
    }
    @Test
    public void getRamTest() {
        PC perscomp = mock(PC.class);
        when(perscomp.getRam()).thenReturn(8);
        assertEquals(8, perscomp.getRam());
    }
    @Test
    public void getHddTest() {
        PC perscomp = mock(PC.class);
        when(perscomp.getHdd()).thenReturn(2000);
        assertEquals(2000, perscomp.getHdd());
    }
    
    @Test
    public void setModelTest(){
        PC perscomp = mock(PC.class);
        perscomp.setModel("i5");
        perscomp.setModel("i7");
        perscomp.setModel("i7");
        perscomp.setModel("i7");
        perscomp.setModel("i3");

        verify(perscomp, times(1)).setModel("i5");
        verify(perscomp, times(3)).setModel("i7");
        verify(perscomp, times(1)).setModel("i3");

        InOrder inOrder = inOrder(perscomp);
        inOrder.verify(perscomp).setModel("i5");
        inOrder.verify(perscomp, times(3)).setModel("i7");
        inOrder.verify(perscomp).setModel("i3");
    }
}
