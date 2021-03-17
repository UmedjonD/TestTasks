package kurs3;

import kurs3.Uni;

import java.util.Scanner;

public class Masud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0) {
                    arr[i][j] = j + 1;
                }
                for (int k = 1; k < n; k++) {

                    if (i == k && j == arr.length-1) {
                        arr[k][arr.length-1] = arr.length+1;
                    }
                }

//
//                if (i == 1 && j == arr.length-1) {
//                    arr[i][j] = 10-arr[0][3];
//                }
//                if (i == 2 && j == arr.length-1) {
//                    arr[i][j] = 10-arr[0][2];
//                }
//                if (i == 3 && j == arr.length-1) {
//                    arr[i][j] = 10-arr[0][1];
//                }
//                if (i == 4 && j == arr.length-1) {
//                    arr[i][j] = 10-arr[0][0];
//                }

                    System.out.print(arr[i][j]);

            }
            System.out.println();
        }
    }
}
