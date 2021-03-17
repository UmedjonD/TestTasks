package Alexeev;

import java.util.Scanner;

//Arifmetika
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a <= 100 && b <= 100 && c <= Math.pow(10, 6)) {
            if ((a * b) == c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
