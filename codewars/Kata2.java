package codewars;

public class Kata2 {
    public static void main(String[] args) {
        System.out.println(solution("hjkjjkid","id"));
    }

    public static boolean solution(String str, String ending) {
        return str.substring(str.length() - ending.length()) == ending;
    }

}
