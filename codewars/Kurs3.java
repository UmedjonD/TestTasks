package codewars;

import java.util.Arrays;
import java.util.Scanner;

public class Kurs3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int k, n;
        n=scanner.nextInt();
        k=scanner.nextInt();
        for (int i=0; i<n; i++) {

            System.out.println(k*i);
        }




//        int k,n;
//        n=scanner.nextInt();
//        k=scanner.nextInt();
//        for ( int i=0; i<n; i++){
//            System.out.println(k);
//        }


        //max min in array
//        int n=scanner.nextInt();
//        int [] a =new int[n];
//        for (int i=0; i<n; i++){
//            a[i]=scanner.nextInt();
//        }
//        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
//        for (int y=0;y<n;y++){
//            if (a[y]<min) {
//                min=a[y];
//            }
//            if (a[y]>max){
//                max=a[y];
//            }
//        }
//        System.out.println(Arrays.toString(a));
//        System.out.println("min="+min);
//        System.out.println("max="+max);

    }
}
