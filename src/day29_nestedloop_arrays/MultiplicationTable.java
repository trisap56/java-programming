package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outter = 1; outter <= 10; outter++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print((outter * inner) + "\t");
            }
            System.out.println();
        }
    }
}
