package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java", 3, '|'));
    }
    public static String repeatString(String word, int times, char delimiter) {
        String str = "";
        for (int i = 1; i <= times; i++) {
             str += word  +delimiter;
        }
        return str;

    }
}
