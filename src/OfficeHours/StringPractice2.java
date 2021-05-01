package OfficeHours;

public class StringPractice2 {
    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";
        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0,word1.length()));

        String word3 = "elephant";
        if(word3.length()%2 == 0 ) {
            System.out.println(word3.substring(word3.length()/2 -1, word3.length()/2+1));
        } else if(word3.length()%2 == 1) {
            System.out.println(word3.substring(word3.length()/2 - 1,word3.length()/2));
        }

    }
}
