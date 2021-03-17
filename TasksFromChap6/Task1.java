package TasksFromChap6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();

        if ((n*n) % n == 0) {
            System.out.println("Выводим все числа меньше чем - n");
            for (int i=n; i>=0; --i) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Надо ввести числа у которых есть корень например 4 9 16 25 ...");
        }

    }
}
