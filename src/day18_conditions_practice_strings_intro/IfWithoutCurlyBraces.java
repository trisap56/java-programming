package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";

        if (todaysClass.equals("java"))
            System.out.println("java is fun");

        int score = 1;
        if (score == 1) {
            System.out.println("your score is " + score);
        } else if (score == 2) {
            System.out.println("your score is " + score);
        } else if (score == 3) {
            System.out.println("your score is " + score);
        } else {
            System.out.println("invalid score");
        }


    }
}

