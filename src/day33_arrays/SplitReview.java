package day33_arrays;

import java.util.*;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array = word.split("a");
        System.out.println(array.length);
        int countOfA = array.length - 1;
        if (word.endsWith("a")) {
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);

        System.out.println("-------SPLIT WITH EMPTY STRING-------");
        String[]strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);

        String word2 = "java1html2sql";
        String[]strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));


    }
}
