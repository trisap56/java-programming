package OfficeHours;

import java.util.*;

public class ProblemSet1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int num = scan.nextInt();
        if (num < 2) {
            System.out.println("Live with less than 2 people");
        } else if (num > 2 && num < 7) {
            System.out.println("Live with 3-6 people");
        } else {
            System.out.println("Live with 2 people");
        }
        System.out.println("What city do you live in?");
        String city = scan.next();
        System.out.println("Do you live downtown?");
        String downtown = scan.next();
        if (downtown.equals("yes") || downtown.equals("no")) {
            System.out.println("Have you thought about moving to the suburbs?");
            String suburbs = scan.next();
            if (suburbs.equals("yes")) {
                System.out.println("Do it, it's great!");
            } else if (suburbs.equals("no")) {
                System.out.println("You should think about it.");
            }
        }
        System.out.println();
        System.out.println("What is your favorite favoriteAnimal?");
        String favoriteAnimal = scan.next();
        System.out.println("Wow! " + favoriteAnimal + "s are great animals!");
        System.out.println();
        System.out.println("How many pets do you want?");
        String numOfPets = scan.next();
        System.out.println("Interesting, do you want " + numOfPets + " " + favoriteAnimal + "s?");

    }
}
