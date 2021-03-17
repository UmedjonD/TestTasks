package codewars;

class Kata {
    public static void main(String[] args) {
        System.out.println(getMiddle("kalamanop"));
    }

    public static String getMiddle(String word) {
        //Code goes here!
        if (word.length() % 2 == 0) {
            int ccount = word.length() / 2;
            return word.substring(ccount-1, ccount+1);
        }
        else {
            int count2 = word.length() / 2;
            return String.valueOf(word.charAt(count2));
        }
    }
}
