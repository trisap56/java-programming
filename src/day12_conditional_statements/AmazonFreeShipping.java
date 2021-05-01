package day12_conditional_statements;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price: ");
        double totalPrice = scan.nextDouble();

        if (totalPrice >= 25) {
            System.out.println("FREE SHIPPING ELIGIBLE." + " Your order total: $" + totalPrice);
        } else {
            System.out.println("FREE SHIPPING UNAVAILABLE" + " Your order total: $" + totalPrice);
        }
        System.out.println("THANKS FOR SHOPPING AMAZON!");
    }
}
