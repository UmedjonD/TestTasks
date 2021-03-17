package TasksFromChap11;

import java.util.Arrays;

/**
 * Chapter 11, task 11.
 * */
public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, -1, 2, -2, 3, -4, 5, 6, 7, -9};
        int[] arr2 = new int[10];

        /**можно было сделать с помощью алгоритм сортировок, самая простая пузырковая, но есть замечательные метод sort
         * который за нас делает =)*/
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        /**сортированный массив копируем в другой массив в выводим*/
        System.arraycopy(arr1, 0, arr2, 0, 10);
        System.out.println(Arrays.toString(arr2));

    }
}
