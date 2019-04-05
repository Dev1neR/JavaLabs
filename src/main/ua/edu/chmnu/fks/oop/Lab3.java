/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author 1710506
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
        int a[][] = { { 1, 0, 0, 0 }, 
                      { 1, 4, 0, 0 }, 
                      { 2, 1, 2, 0 }, 
                      { 3, 4, 1, 6 } }; 
        boolean isUpper = true;
        boolean isLower = true;
    /*    for (int i = 0; i < a.length; ++i) {
            //a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; ++j) {
                a[i][j] = rnd.nextInt(101) - 50;
            }
        }*/

        for (int i = 0; i < a.length && isUpper; i++) {
            for (int j = 0; j < i && isUpper; j++) {
                isUpper = a[i][j] == 0;
            }
        }

        for (int i = 0; i < a.length && isLower; i++) {
            for (int j = i + 1; j < a[i].length && isLower; j++) {
                isLower = a[i][j] == 0;
            }
        }

        for (int[] row : a) {
            System.out.println(Arrays.toString(row));
        }

        if (isLower) {
            System.out.println("The matrix is Lower Triangular");
        } else if (isUpper) {
            System.out.println("The matrix is Upper Triangular");
        } else {
            System.out.println("Normal matrix");
        }
    }

}
