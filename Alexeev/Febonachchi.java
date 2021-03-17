package Alexeev;

import java.util.Scanner;

public class Febonachchi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibo(n - 1) + fibo(n - 2);
            }
        }
}
