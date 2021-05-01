package day16_switch_ternary;
import java.util.Scanner;

public class CapuccinoBuyer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price;
        int calories;
        System.out.println("What size would you like?");
        String size = scan.next();

        switch(size) {
            case "tall":
                System.out.println("Tall capuccino please.");
                price = 3.69;
                calories = 90;
                System.out.println("Total price: " + price);
                break;
            case "grande":
                System.out.println("Grande capuccino please.");
                price = 3.99;
                calories = 120;
                System.out.println("Total price: " + price);
                break;
            case "venti":
                System.out.println("Venti capuccino please.");
                price = 4.29;
                calories = 150;
                System.out.println("Total price: " + price);
                break;
            default:
                System.out.println("We do not serve that size of capuccino.");
        }

    }
}
