package day13_conditional_statements;
import java.util.Scanner;

public class NiceDayOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("temp:\t");
        double temp = input.nextDouble();
        System.out.println("");
        if (temp >= 70){
            System.out.println("It is a beautiful day!\n" + "Lets code java.");
        }else{
            System.out.println("It is kind of cold today!\n" +"Stay home and code java.");
        }

    }
}
