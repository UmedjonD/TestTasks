package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {
    public static void main(String[] args) {
        System.out.print(reverseWords("salam [kak] dela beatan"));
    }

    public static String reverseWords(final String original) {

        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());

        //        {
//            String[] array = original.split(" ");
//
//            if(array.length == 0)
//                return original;
//
//
//            int i = 0;
//            for(String string : array){
//                array[i] = new StringBuilder(string).reverse().toString();
//                i++;
//            }
//
//            return String.join(" ",array);
//        }

//мой варианта
        //        char[] carArr = original.toCharArray();
//        String str = "";
//        List<String> stringList = new ArrayList<>();
//
//        for (int i = 0; i < original.length(); i++) {
//            str +=(carArr[i]);
//            if (carArr[i] == ' ') {
//                stringList.add(str);
//                str = "";
//            }
//        }
//        stringList.add(str);
//        System.out.println(stringList);
//
//        str = "";
//        for (int i=0; i<stringList.size(); i++) {
//            String stringReverse = stringList.get(i);
//            stringReverse.trim();
//            StringBuffer stringBuffer = new StringBuffer(stringReverse).reverse();
//            str += stringBuffer;
//        }
//        return str.trim();
    }
}
