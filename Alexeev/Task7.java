package Alexeev;

import java.util.Scanner;
//Abba
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        long FirstMax = Math.max(a,b);
        long max = Math.max(c, FirstMax);

        System.out.println("max = " + max);
    }
}
