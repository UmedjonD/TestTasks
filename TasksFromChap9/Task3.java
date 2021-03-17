package TasksFromChap9;

import java.util.Scanner;

/***
 * Chapter 9, task 9.22
 * */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести четные количество букв");
        String line = scanner.nextLine();

        if (line.length() % 2 == 0) {
            int division = line.length() / 2;
            System.out.println(line.substring(0, division));
        } else {
            System.out.println("Чувак , сказал же четные количество ");
        }
    }
}
