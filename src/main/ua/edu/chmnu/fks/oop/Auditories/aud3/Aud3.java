/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop.aud3;

/**
 *
 * @author Dev1ne
 */
public class Aud3 {

    static void sort(int array[]) {
        int sz = array.length;
        for (int i = 1; i < sz; ++i) {
            int pointer = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > pointer) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = pointer;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int array[]) {
        int sz = array.length;
        for (int i = 0; i < sz; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {2, 5, -5, 4, 10, 13, 7};
        sort(array);
        printArray(array);
    }
}
