/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop.aud4;

import java.math.BigInteger;

/**
 *
 * @author Dev1ne
 */
public class Aud4 {

    public static void main(String[] args) {
        int number = 3;
        System.out.printf("Факториал %s - %s", number, factorial(number));
    }

    public static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
