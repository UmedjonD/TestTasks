package Alexeev;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summa = 0;

        for (int i=0; i<=n; i++) {
            summa += i;
        }
        System.out.println(summa);
    }
}
