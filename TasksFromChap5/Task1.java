package TasksFromChap5;

import java.util.Scanner;

/**
 * Chapter 5, task 5.10
 * */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] columArr = new int[20];
        System.out.print("введите курс: ");
        int currency = scanner.nextInt();

        for (int i = 1; i < columArr.length; i++) {
            columArr[i] = i * currency;
            System.out.println(i + " доллар = " + columArr[i] + " рублей ");
        }
    }
}
