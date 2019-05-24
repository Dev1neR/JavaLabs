/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import main.ua.edu.chmnu.fks.oop.Lab7;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
/**
 *
 * @author Dev1ne
 */
public class Lab7Test {

    public Lab7Test() {
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

    public static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void quickSortTest1() {
        int arr[] = {1, 5, 2, 6, -2, 4};
        int expectations[] = {-2, 1, 2, 4, 5, 6};
        Lab7.Sort qsort = spy(Lab7.Sort.class);
        int high = arr.length - 1;
        qsort.sort(arr, 0, high);
        printArray(arr);
        assertArrayEquals(expectations, arr);
    }
    @Test
    public void quickSortTest2() {
        int arr[] = {10, 50, 20, 60, -20, 40};
        int expectations[] = {-20, 10, 20, 40, 50, 60};
        Lab7.Sort qsort = spy(Lab7.Sort.class);
        int high = arr.length - 1;
        qsort.sort(arr, 0, high);
        printArray(arr);
        assertArrayEquals(expectations, arr);
    }
}
