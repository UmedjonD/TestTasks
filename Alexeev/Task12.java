package Alexeev;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,x1,y1,x2,y2,x3,y3,x4,y4,k=0;
        double S,S1,S2,S3,S4,a,b;

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            x3 = sc.nextInt();
            y3 = sc.nextInt();
            x4 = sc.nextInt();
            y4 = sc.nextInt();

            S1 = Math.sqrt(Math.pow((x-x2),2) + Math.pow((y-y2),2)
                    + Math.pow((x2-x1),2) + Math.pow((y2-y1),2)
                    + Math.pow((x1-x),2) + Math.pow((y1-y),2));

            S2 = Math.sqrt(Math.pow((x-x3),2) + Math.pow((y-y3),2)
                    + Math.pow((x3-x2),2) + Math.pow((y3-y2),2)
                    + Math.pow((x2-x),2) + Math.pow((y2-y),2));

            S3 = Math.sqrt(Math.pow((x-x4),2) + Math.pow((y-y4),2)
                    + Math.pow((x4-x3),2) + Math.pow((y4-y3),2)
                    + Math.pow((x3-x),2) + Math.pow((y3-y),2));

            S4 = Math.sqrt(Math.pow((x4-x),2) + Math.pow((y4-y),2)
                    + Math.pow((x-x1),2) + Math.pow((y-y1),2)
                    + Math.pow((x1-x4),2) + Math.pow((y1-y4),2));

            a = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
            b = Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));

            S = a * b;
            System.out.println(S);
            System.out.println(S1+S2+S3+S4);

            if (S1+S2+S3+S4 == S) {
                k++;
            }
        }
        System.out.println(k);
    }
}
