package Begin;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int s=0;
        for (int i=1; i<=10; i++){

            if (i%2!=0) {
            s=s+i;


            }

        }
        System.out.println(s);
    }
}
