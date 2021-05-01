package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        char unique;
        for (int index = 0; index < word.length(); index++) {
            for (int j = 0; j <= index; j++) {
                //            System.out.print(word.charAt(j));
            }
            //        System.out.println();
        }

        /**
         * java
         * ava
         * va
         * a
         * Outer: 0 - word.length()
         * Inner: Outer - word.length
         */

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();  //new line after inner loop
        }
    }
}

