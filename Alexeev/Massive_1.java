package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Massive_1 {
    public static void main(String[] args) {

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (i == k) {
                    arr[i][k] = 1;
                }
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }


    }
}
