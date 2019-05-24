/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop.aud2;

/**
 *
 * @author Dev1ne
 */
public class Aud2 {
    public static void main(String[] args) {
        int sz = 10;
        double azero = 1, sum = 0;
        double[] array = new double[sz];
        array[0] = azero;

        System.out.printf("elem[0]:%f\n", array[0]);
        for(int i = 1; i < sz; i++) {
            array[i] = array[i - 1] + azero / (azero + 1);
            azero++;
            if(i < 10) {
                sum += array[i];
            }
            System.out.printf("elem[%d]:%f\n", i ,array[i]);
        }
        System.out.printf("Sum:" + sum);
    }
}