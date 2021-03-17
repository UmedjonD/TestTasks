package TasksFromChap9;

import java.util.Scanner;

/***
 * Chapter 9, 9.17
 * */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str2 = scanner.nextLine();
        String str = "акка";
        int lastLetter = str2.length();

        if (str2.charAt(0) == str2.charAt(lastLetter - 1)){
            System.out.println("Первая и последняя буква это  " + str2.charAt(0));
        } else {
            System.out.println("Не одинаковые буквы ");
        }

        //когда заранее знаем длину нашей строки =)
        if (str.charAt(0) == str.charAt(3)) {
            System.out.println("если ты это читаешь на консоли значит одинаковые буквы");
        }
    }
}
