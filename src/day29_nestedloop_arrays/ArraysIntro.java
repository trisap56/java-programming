package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; //single variable
        int[] nums = new int[3]; //array variable
        nums [0] = 5;
        nums [1] = 10;
        nums [2] = 7;
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        //WE CAN USE INT VARIABLE FOR INDEX #
        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);

        System.out.println("number of elements = " + nums.length);
        int length = nums.length;
        System.out.println("length = " + length);



    }
}
