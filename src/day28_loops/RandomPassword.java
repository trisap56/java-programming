package day28_loops;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";


        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(71);
            password += (source.charAt(index));

        }

        System.out.println("password = " + password);

    }
}
