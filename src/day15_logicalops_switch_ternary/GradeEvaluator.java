package day15_logicalops_switch_ternary;

import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter grade:\t");
        char grade = scan.next().charAt(0);

        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("passed with " + grade);
        } else if (grade == 'D') {
            System.out.println("qualify for retake");
        } else if (grade == 'F') {
            System.out.println("fail");
        } else {
            System.out.println("invalid grade");
        }


    }
}
