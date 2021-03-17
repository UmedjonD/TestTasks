package DegitalDesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1) Этот варинат работает когда ввод например в таком ввиде (3[as]2[b]2[od])
 * 2) Сделать так чтобы работала и в таком ввиде 3[2[ab]c], пока в процессе
 * P.S Первый вариант сделал в тот же день , наверное легче сделать как-то с помощью регулярных выражений,
 * но regex увы плохо знаю =(
 * P.S2 сорян за столь вложенность =)
  */

public class FistVersion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] digit = str.toCharArray();
        char[] chisla = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String newText = "";

        for (int k = 0; k < str.length(); k++) {
            for (char ch : chisla) {
                if (digit[k] == ch) {
                    sb.append(digit[k]);
                    k++;
                    if (digit[k] == '[') {
                        for (int i1 = k + 1; i1 < str.length(); i1++) {
                            if (digit[i1] != ']') {
                                sb2.append(digit[i1]);
                            }
                            if (digit[i1] == ']') {
                                break;
                            }
                        }
                    }
                    int n = Integer.parseInt(String.valueOf(sb));
                    for (int i = 0; i < n; i++) {
                        newText += sb2;
                    }
                    sb.setLength(0);
                    sb2.setLength(0);
                }
            }
        }
        System.out.print(newText);
    }
}
