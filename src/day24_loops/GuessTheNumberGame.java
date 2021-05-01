package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        //System.out.println(randomNum.nextInt(101));
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber;
        do{
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber>secretNumber) {
                System.out.println("Number too big");
            } else if(guessingNumber<secretNumber) {
                System.out.println("number too small");
            }
        } while (secretNumber != guessingNumber);
        System.out.println("Congrats!");
    }
}
