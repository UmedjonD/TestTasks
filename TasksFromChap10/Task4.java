package TasksFromChap10;

import java.util.Scanner;

/**
 * Chapter 10, task 10.55
 */
public class Task4 {

    public static String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число N ");
        int n = scanner.nextInt();
        System.out.println("Перевод в " + n + " - ичную систему счисления ");
        System.out.println(getNotation(n, 122));
    }

    public static String getNotation(int n, int number) {
        return (number == 0) ? "" : getNotation(n,number / n) + digits[number % n];
    }

}
