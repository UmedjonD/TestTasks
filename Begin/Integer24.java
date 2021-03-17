package Begin;

import java.util.Scanner;

public class Integer24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int mod = 7;
        if (k % mod == 0) {
            System.out.println("воскресенье");
        } else if (k % mod == 1) {
            System.out.println("понидельник");

        } else if (k % mod == 2) {
            System.out.println("вторник");
        }
         else if (k % mod == 3) {
            System.out.println("среда");
        }
        else if (k % mod == 4) {
            System.out.println("четверг");
        }
        else {
            System.out.println("pyatnisa");
        }

    }
}
