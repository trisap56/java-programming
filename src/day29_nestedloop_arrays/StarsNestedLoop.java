package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for(int outter = 1; outter<=5; outter++) {
            System.out.println();
            for(int inner = 1; inner<= 10; inner++) {
                System.out.print("* ");
            }
        }
        System.out.println();

        for(int outter = 1; outter <= 10; outter++) {
            for(int inner = 1; inner <= outter; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
