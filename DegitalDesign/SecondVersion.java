package DegitalDesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * В процессе , постораюсь в срок сделать и за'push'ит
 */
public class SecondVersion {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] digit = str.toCharArray();
        char[] chisla = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int n2 = 0;
        String newText = "";

        //3[2[ab]c] = ababcababc
        int count = 0;
        for (int k = 0; k < str.length(); k++) {
            for (char ch : chisla) {
                if (digit[k] == ch) {
                    sb.append(digit[k]);
                    k++;
                    if (digit[k] == '[') {
                        for (int i1 = k + 1; i1 < str.length(); i1++) {

                            for (char ch2 : chisla) {
                                if (digit[i1] == ch2) {
                                    sb3.append(digit[i1]);
                                    //
                                    n2 = Integer.parseInt(String.valueOf(sb3));
                                    for (int l = 0; l < n2; l++) {
                                        if (digit[i1] != ']') {
                                            sb2.append(digit[i1]);
                                        }
                                        if (digit[i1] == ']') {
                                            break;
                                        }
                                    }
                                } else {
                                    if (digit[i1] != ']') {
                                        sb2.append(digit[i1]);
                                    }
                                    if (digit[i1] == ']') {
                                        break;
                                    }
                                }
                            }

                        }
                    }
                    int n = Integer.parseInt(String.valueOf(sb));
                    for (int i = 0; i < n; i++) {
                        newText += sb2;
                    }
                    sb.setLength(0);
                    sb2.setLength(0);
                    sb3.setLength(0);
                }
            }
        }
        System.out.print(newText);
        System.out.println(sb);
        System.out.println(sb2);
    }

//        while (count < str.length()) {
//            for (char smbl : chisla) {
//                if (smbl == digit[count]) {
//                    sb.append(digit[count]);
//                    count++;
//                    int n = Integer.parseInt(String.valueOf(sb));
//                    for (int i = count+1; i < n; i++) {
//                        if (digit[i] == chisla[i]) {
//                            n2 = (int) digit[i];
//                            for (int j = count; j < n2; j++) {
//                                if (digit[j] != ']') {
//                                    sb2.append(digit[j]);
//                                }
//                                if (digit[j] == ']') {
//                                    break;
//                                }
//                            }
//                        } else {
//                            sb2.append(digit[i]);
//                            if (digit[i] == ']') {
//                                break;
//                            }
//                        }
//                    }
//                }
//
//            }
//            count++;
//        }
}

