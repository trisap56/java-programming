package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String username = "";
        if(StringUtils.isNullOrEmpty(username)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println("isPalindrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + StringUtils.isPalindrome("Cybertek"));

        System.out.println(reverse("java"));


    }
}
