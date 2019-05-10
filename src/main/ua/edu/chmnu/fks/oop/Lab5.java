/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

class Matrix {

    private double[][] data = null;
    private int rows = 0, cols = 0;

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

public class Lab5 {

    private static Matrix result;

    public static void main(String[] args) {
        Matrix m1 = new Matrix(3, 3);
        m1.get_input();
        m1.display();
        
        Matrix m2 = new Matrix(3, 3);
        m2.get_input();
        m2.display();
        
        result = m1.transpose();
        System.out.println("\nTransposed matrix:\n");
        result.display();
        
        result = m1.addMatrix(m1, m2);
        System.out.println("\nResult of adding to matrices:\n");
        result.display();
        
        result = m1.subMatrix(m2, m1);
        System.out.println("\nResult of substracting to matrices:\n");
        result.display();
    }

}
