package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(7);
        count(2);
        int num2 = 99;
        count(num2);
        String word = "wooden spoon";
        count(word.length());
        printAge(2003);

    }

    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("Birth year: " + year + ". Age: " + age) ;
    }

    public static void count(int num) {
        for(int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
