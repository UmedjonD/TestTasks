package Alexeev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Статистика
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива = ");
        int N = scanner.nextInt();
        int[] arr = new int[N];


        List<Integer> chetList = new ArrayList<>();
        List<Integer> nechettList = new ArrayList<>();

        int chet = 0;

        for (int i = 0; i <= N-1; i++) {
            System.out.print(i + " значения массива = ");
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) {
                chet = arr[i];
                chetList.add(chet);
            } else {
                nechettList.add(arr[i]);
            }
        }
        System.out.println();
//        System.out.println(Arrays.toString(arr));
        System.out.println(chetList);
        System.out.println(nechettList);

        if (nechettList.size() > chetList.size()) System.out.println("NO");
        else System.out.println("YES");
    }
}
