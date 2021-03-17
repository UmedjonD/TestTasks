package codewars;

/*
*
* */
public class PangramChecker {

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }

    public static boolean check(String sentence) {
        //code
        String findstr = "";
        String findstr2 = "";
        char[] ch = sentence.toCharArray();
        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                ' ', '.', '!', '?', '-'};

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if (ch[i] == alphabets[j]) {
                    findstr += ch[i];
                    break;
                }
            }
        }

        for (int i = 0; i < ch.length - 1; i++) {
            for (int k = 0; k < alphabets.length; k++) {
                if ((ch[i] == alphabets[k])) {
                    findstr2 += ch[i];
                    break;
                }
            }
        }
        System.out.println(findstr);
        System.out.println(findstr2);

        if (findstr.equals(findstr2)) {
            return true;
        } else {
            return false;
        }
    }
}
