package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("=================");

        String password = "abc123";
        int count = password.length();
        if(password.length() >= 6) {
            System.out.println("Valid password");
        } else {
            System.out.println("Password must be at least 6 characters");
        }


    }
}
