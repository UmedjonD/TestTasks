package TasksFromChap5;

import java.util.Scanner;

/**
 * Chapter 5, task 5.64
 */
public class Task2 {
    private static final int N = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0;
        int square[] = new int[N], people[] = new int[N];

        for (int i = 1; i <= N; i++) {
            System.out.print("введите количество жителей " + i + " - его районах: ");
            people[i] = scanner.nextInt();
            n += people[i];
        }

        for (int i = 1; i <= N; i++) {
            System.out.print("площадь " + i + " - его района: ");
            square[i] = scanner.nextInt();
            m += square[i];
        }

        int density = m/n;
        System.out.println("плотность = " + density);
    }
}










