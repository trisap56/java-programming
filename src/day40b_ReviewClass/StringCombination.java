package day40b_ReviewClass;

public class StringCombination {
    public static void main(String[] args) {
        stringCombo("abc","defgh");
    }
    public static void stringCombo(String one, String two ) {
        one = "abc";
        two = "defgh";

        System.out.print(one.charAt(0) + "" + two.charAt(0));
        System.out.print(one.charAt(1) + "" + two.charAt(1));
        System.out.print(one.charAt(2) + "" + two.charAt(2));
        System.out.print(two.charAt(3) + "" + two.charAt(4));


        System.out.println();


        for(int i = 0; i < one.length(); i++) {
            System.out.print(one.charAt(i));
            for(int j = 0; j < two.length();j++) {
                System.out.print(two.charAt(j));

            }
        }
    }
}
