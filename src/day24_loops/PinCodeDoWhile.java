package day24_loops;
import java.util.*;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        System.out.print("Enter pincode: ");
        int pinCode =scan.nextInt();
        do {
            System.out.print("Enter pincode: ");
            pinCode =scan.nextInt();
        } while (secretPinCode != pinCode);
        System.out.println("Thank you!");
    }
}
