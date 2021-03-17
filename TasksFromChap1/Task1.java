package TasksFromChap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *chapter 1, task number 1.3*
 * */
public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод №1 = ");
        int number = scanner.nextInt();
        System.out.println("Вы ввели число " + number);

        //Второй способ через Buffered
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ввод №2 = ");
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println("Вы ввели второе число " + number2);
    }
}
