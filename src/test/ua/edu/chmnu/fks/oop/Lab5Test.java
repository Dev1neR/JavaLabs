/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1710506
 */
public class Lab5Test {
    private static Matrix result;

    Matrix m1 = new Matrix(3, 3);
    Matrix m2 = new Matrix(3, 3);
    Matrix expect = new Matrix(3, 3);
    
    public Lab5Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        m1.data[0][0] = 1;
        m1.data[0][1] = 2;
        m1.data[0][2] = 3;
        m1.data[1][0] = 4;
        m1.data[1][1] = 5;
        m1.data[1][2] = 6;
        m1.data[2][0] = 7;
        m1.data[2][1] = 8;
        m1.data[2][2] = 9;
        
        m2.data = m1.data;
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testTranspose() {
        expect.data[0][0] = 1;
        expect.data[0][1] = 4;
        expect.data[0][2] = 7;
        expect.data[1][0] = 2;
        expect.data[1][1] = 5;
        expect.data[1][2] = 8;
        expect.data[2][0] = 3;
        expect.data[2][1] = 6;
        expect.data[2][2] = 9; 
        
        result = m1.transpose();
        assertArrayEquals(expect.data,result.data);
    }
    @Test
    public void testAdd() {
        expect.data[0][0] = 2;
        expect.data[0][1] = 4;
        expect.data[0][2] = 6;
        expect.data[1][0] = 8;
        expect.data[1][1] = 10;
        expect.data[1][2] = 12;
        expect.data[2][0] = 14;
        expect.data[2][1] = 16;
        expect.data[2][2] = 18; 
        
        result = m1.addMatrix(m1, m2);
        result.display();
        assertArrayEquals(expect.data,result.data);
    }
    @Test
    public void testSub() {
        expect.data[0][0] = 0;
        expect.data[0][1] = 0;
        expect.data[0][2] = 0;
        expect.data[1][0] = 0;
        expect.data[1][1] = 0;
        expect.data[1][2] = 0;
        expect.data[2][0] = 0;
        expect.data[2][1] = 0;
        expect.data[2][2] = 0; 
        
        result = m1.subMatrix(m2, m1);
        result.display();
        assertArrayEquals(expect.data,result.data);
    }
}

class Matrix {

    public double[][] data = null;
    public int rows = 0, cols = 0;

    public Matrix(int rows, int cols) {
        data = new double[rows][cols];
        this.rows = rows;
        this.cols = cols;
    }

    public Matrix(double[][] data) {
        this.data = data.clone();
        rows = this.data.length;
        cols = this.data[0].length;
    }

    public void get_input() {
        Scanner s = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Enter the matrix elements(row-wise)");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                data[i][j] = s.nextDouble();
            }

        }
    }

    public void display() {
        System.out.print("[");
        for (int row = 0; row < rows; ++row) {
            if (row != 0) {
                System.out.print(" ");
            }

            System.out.print("[");

            for (int col = 0; col < cols; ++col) {
                System.out.printf("%8.3f", data[row][col]);

                if (col != cols - 1) {
                    System.out.print(" ");
                }
            }

            System.out.print("]");

            if (row == rows - 1) {
                System.out.print("]");
            }

            System.out.println();
        }
    }

    public Matrix transpose() {
        Matrix result = new Matrix(cols, rows);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[j][i];
            }
        }
        return result;
    }

    public Matrix addMatrix(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(cols, rows);
        
        for(int i = 0; i < rows; i++){
         for(int j = 0; j < cols; j++){
            result.data[i][j] = m1.data[i][j] + m2.data[i][j];
         }
      }
        return result;
    }
    
    public Matrix subMatrix(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(cols, rows);
        
        for(int i = 0; i < rows; i++){
         for(int j = 0; j < cols; j++){
            result.data[i][j] = m1.data[i][j] - m2.data[i][j];
         }
      }
        return result;
    }
    
}