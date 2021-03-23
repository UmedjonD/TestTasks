package kurs3;

import java.util.Scanner;

public class Uni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3.Сумма цифр массива
        int myArray[] = {3, 7, 5, 12,};
        for (int i = 0; i < myArray.length; i++) {
            int i2 = i + 1;
            if (i2 >= myArray.length - 1) {
                i2 = 0;
                i2 = 0;
            }
            int sum = myArray[i] + myArray[i2];
            System.out.println(sum);
        }
//        int n = scanner.nextInt();
//        int j= 0, t = 0;
//        int[]arr = new int[n];
//        for (int i = 0; i<arr.length ; i++){
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = 0; i<arr.length ; i++){
//            if (arr[i]%2!=0){
//                System.out.print(arr[i] + " ");
//                t++;
//            }
//        }
//        System.out.println();
//        for (int i = 0; i<arr.length ; i++){
//            if (arr[i]%2==0) {
//                System.out.print(arr[i] + " ");
//                j++;
//            }
//        }
//        System.out.println();
//        if (t>j){
//            System.out.println("NO");
//        } else {
//            System.out.println("YES");
//        }
//
//
//        int n, i, j, b, a, z = 0;
//        n = scanner.nextInt();
//        if (n> 0 && n!=0){
//            for (i = 1; i<=n; i++){
//                z+=i;
//            }
//        } else {
//            for (i = 1; i>=n; i--){
//                z+=i;
//            }
//        }
//        System.out.println(z);
//
//
//        long a = scanner.nextLong();
//        long b = scanner.nextLong();
//        long c = scanner.nextLong();
//        if ((a * b) == c) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        int a, b, c = 0, d = 0;
//        for (int i = 0; i < 4; i++) {
//            a= scanner.nextInt();
//            b= scanner.nextInt();
//            c+=a;
//            d+=b;
//        }
//        if (c>d){
//            System.out.println("1");
//        }
//        if (c<d){
//            System.out.println("2");
//        }
//        if (c==d){
//            System.out.println("DRAW");
//        }
//        int a = scanner.nextInt();
//        int n, m,d = 0;
//        for (int i = 0; i < a; i++){
//            n = scanner.nextInt();
//            m = scanner.nextInt();
//            d = 19 * m + (n + 239)*(n + 366) / 2;
//            System.out.println(d);
//        }
    }
}