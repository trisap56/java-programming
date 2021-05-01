package day29_nestedloop_arrays;

import java.util.*;


public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int minutes = 0; minutes <= 4; minutes++) {
            System.out.println("minutes = " + minutes);
            for (int seconds = 0; seconds < 60; seconds++) {
                System.out.println(minutes + " : " + seconds + " ");
                Thread.sleep(1000);
            }
        }
    }
}
