package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word1 = "java";
        //System.out.println(word.charAt(0));
        //System.out.println(word.charAt(1));
        //System.out.println(word.charAt(2));
       // System.out.println(word.charAt(3));

       // System.out.println(word + "-" + word.length());

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        char first1 = company.charAt(0);
        System.out.println(first1);
        char second = company.charAt(1);
        System.out.println(second);
        char third = company.charAt(2);
        System.out.println(third);
        char fourth = company.charAt(3);
        System.out.println(fourth);
        char fifth = company.charAt(4);
        System.out.println(fifth);
        char sixth = company.charAt(5);
        System.out.println(sixth);
        char seventh = company.charAt(6);
        System.out.println(seventh);
        char eighth = company.charAt(7);
        System.out.println(eighth);

        //C y b e r t e k
        System.out.println(first1 + " " + second + " " + third + " " + fourth + " "
                           + fifth + " " + sixth + " " + seventh + " " + eighth);
        String withSpace = first1 + " " + second + " " + third + " " + fourth + " "
                           + fifth + " " + sixth + " " + seventh + " " + eighth;

        System.out.println("withSpace = " + withSpace);

        String word = "mom";
        char first = 'm';
        char last = 'm';





    }
}
