package codewars;

import java.util.LinkedList;
import java.util.List;

public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("akkaboid"));
    }

    public static String disemvowel(String str) {
        // Code away...
        String letter = "aeiouAEIOU";
        char[] charr = str.toCharArray();
        List<Character> list = new LinkedList<>();
        String strEnd = "";

        for (int i=0; i<str.length(); i++ ) {
//            list.add(charr[i]);
            if (letter.indexOf(str.indexOf(i)) == -1) {
                strEnd += charr[i];
            }
        }

//        System.out.println(strEnd);

//        for (int k=0; k<letter.length; k++) {
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(j).equals('a') || list.get(j).equals('o') || list.get(j).equals('i')
//                    || list.get(j).equals('e') || list.get(j).equals('u')) {
//                    list.remove(j);
//                } else {
//                    strEnd += list.get(j);
//                }
//            }
//
//        }
        return strEnd;
    }
}
