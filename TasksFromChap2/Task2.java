package TasksFromChap2;

import java.util.Scanner;

/**
 * Chapter 2, task 2.31
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (!(n >= 100 && n <= 999)) {
            System.out.println("Error , Введите в диапазоне от 100 до 999");
            return;
        }

        int a = (n / 100) * 10 + (n % 10);
        int b = (n / 100) * 100 + (n % 10) * 10 + ((n % 100) * 100) / 1000;
        int x = ((n % 100) * 100) / 1000;
        System.out.println("Наше число = " + n);
        System.out.println("Зачеркнули вторую цифру " + a);
        System.out.println("cправа прописали вторую цифру " + b);
        System.out.println("значение X = " + x);

    }
}
