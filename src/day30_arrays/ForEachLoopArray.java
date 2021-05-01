package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        for (int each : data) {
            System.out.println(each);
        }

        for (int i : data) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        System.out.println("last value: " + data[data.length - 1]);

        for( int idx = data.length - 1; idx >= 0; idx--) {
            System.out.print(data[idx] + " ");
        }

    }
}
