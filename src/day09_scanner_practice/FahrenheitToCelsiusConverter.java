package day09_scanner_practice;
import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("###### F TO C CONVERTER ######");
        System.out.print("Enter temp(f):\t" );
        double temp = scan.nextDouble();
        double convertedTemp = (temp - 32) * 5/9;
        System.out.println(convertedTemp + " C");
    }
}
