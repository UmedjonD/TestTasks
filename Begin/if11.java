package Begin;

import java.util.Scanner;

public class if11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a>b){
            System.out.println("a = "+ a +"   b = " +a);
        } else if (b>a) {
            System.out.println("a = "+b + "   b = "+b);
        } else {
            System.out.println("a = "+(a+0) +"   b = " + (b+0));
        }
    }
}
