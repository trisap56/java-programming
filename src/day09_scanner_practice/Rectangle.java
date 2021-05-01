package day09_scanner_practice;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***Rectangle Properties***");
        System.out.println("==========================");
        System.out.println("Enter length/width: ");
        double length = scan.nextDouble();
        double width = scan.nextDouble();

        System.out.println("Perimeter = " + 2 * length * width);
        System.out.println("Area = " + width * length);



    }
}
