package TasksFromChap11;

import java.util.Arrays;
import java.util.Scanner;

/***
 * Chapter 11, task 11.158
 * */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int razmer = 10;
        int[] array = new int[razmer];

        //заполняем массив
        for (int i = 0; i < array.length; i++) {
            int n = scanner.nextInt();
            array[i] = n;
        }
        //присваеваем 0 если число порторяется , типа удаляем
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                array[i] = 0;
            }
        }
        //вывод после удаления одинаковых ячеек
        System.out.println(Arrays.toString(array));

        //все удаленные числа (ячейки которые содержать 0 переместим в конец массива)
        for (int j=0; j<array.length-1; j++) {
            for (int i = j; i < array.length - 1; i++) {
                if (array[i] == 0) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        //вывод готового массива , было потно , но я смог
        System.out.println(Arrays.toString(array));
    }
}
