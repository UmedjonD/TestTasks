package TasksFromChap4;

import java.util.Scanner;

/***
 *Chapter 4, task 4.67
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k >= 0 && k < 365) {
            int days = k % 7;
            switch (days) {
                case 1:
                    System.out.println("monday, workday");
                    break;
                case 2:
                    System.out.println("вторник, workday");
                    break;
                case 3:
                    System.out.println("среда, workday");
                    break;
                case 4:
                    System.out.println("четверг, workday");
                    break;
                case 5:
                    System.out.println("пятница, workday");
                    break;
                case 6:
                    System.out.println("суббота, выходной же , отдыхай");
                    break;
                case 0:
                    System.out.println("воскресенье, выходной");
                    break;
                default:
                    System.out.println("что-то не так,");
            }
        } else
            System.out.println("день не может быть отрицательным и больше 365 дней");
    }
}
