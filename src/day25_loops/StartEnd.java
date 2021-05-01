package day25_loops;
import java.util.*;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start value:");
        int start = scan.nextInt();
        System.out.print("Enter end value:");
        int end = scan.nextInt();
        System.out.println();
        if(start>end) {
            System.out.println("reverse numbering not allowed");
        }

        for(int i = start;i<=end;i++) {
            System.out.println(i);
        }
    }
}
