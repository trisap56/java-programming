package day40b_ReviewClass;

public class CountLetters {
    public static void main(String[] args) {
        countLetters("apple tree");
    }

    public static void countLetters(String str) {
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char eachLetter = str.charAt(i);

            if (!checked.contains((" " + eachLetter))) {


                for (int j = 0; j < str.length(); j++) {
                    char eachOtherLetter = str.charAt(j);
                    if (eachLetter == eachOtherLetter) {
                        count++;
                    }
                }

                System.out.println(eachLetter + " - " + count);
                checked += eachLetter + " ";
            }
        }
    }
}
