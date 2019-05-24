/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop;

import java.util.Arrays;
import static java.util.Arrays.sort;

/**
 *
 * @author Dev1ne
 */
public class Lab7 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 7, 2, 1, 6 };

        Sort qsort = (int[] array, int low, int high) -> {
            if(array.length == 0){
                return;
            }
            if(low >= high){
                return;
            }

            int cur = low + (high - low) / 2;
            int i = low, j = high;
            while(i < j){

                while(i < cur && (array[i] <= array[cur])){
                    i++;
                }

                while(j > cur && (array[cur] <= array[j])){
                    j--;
                }

                if(i < j){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
                }
            }

            if(low < j){
                sort(array, low, j);
            }

            if(high > i){
                sort(array, i, high);
            }
        };

        
        System.out.println("Было");
        printArray(arr);

        int high = arr.length - 1;

        qsort.sort(arr, 0, high);
        System.out.println("Стало");
        printArray(arr);
    }
    public static void printArray(int arr[]) {
         System.out.println(Arrays.toString(arr));
    }
    
    @FunctionalInterface
    public interface Sort {
        void sort(int[] array, int low, int high);
    }
}
