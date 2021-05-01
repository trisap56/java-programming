package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word1 = "MOM";
        char first = word1.charAt(0);
        char last = word1.charAt(2);

        if(first == last) {
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters mismatch");
        }

        if(word1.charAt(0) == word1.charAt(2)) {
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters mismatch");
        }

        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(4);

        String word = "java";
        System.out.println(word.indexOf("j"));
    }
}
