package day14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV1 {
    public static void main(String[] args) {
        System.out.print("Enter num1:\t");
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        System.out.print("Enter num2:\t");
        double num2 = scan.nextDouble();
        char operator = '*';
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator: " + operator);
        }
    }
}
