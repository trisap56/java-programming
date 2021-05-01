package day13_conditional_statements;
import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        System.out.print("enter pin: \t");
        double secretPincode = 7961;
        double inputPincode = scan.nextDouble();
        if (secretPincode == inputPincode) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check balance, deposit");
        } else {
            System.out.println("Incorrect pincode! ");
            System.out.println("try again");
        }



    }
}