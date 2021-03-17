package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

//шахматы
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] chess = {"C7-D5","C7-B5","C7-E6","C7-E8","C7-A6","C7-A8"};

        String line = scanner.nextLine();

        for (int i=0; i<=chess.length-1; i++) {
            if (line.equals(chess[i])) {
                System.out.println("YES");
                break;
            }
            else if (!line.equals(chess[i])){
                System.out.println("ERROR");
                break;
            } else {
                System.out.println("NO");
                break;
            }
        }

    }
}
