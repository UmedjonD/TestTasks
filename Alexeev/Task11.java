package Alexeev;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //в процессе
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double s = 0;
        double f1 = 1;
        double f2 = 1;
        double f3 = 1;

        for (int i=1; i<=k; i++) {
                f1 *= (n - i);
                f2 *= i;
                f3 *= (n - 2 * i);
                s = s + (f1 / (f2 * f3));
        }

        System.out.println(s);
    }

}
