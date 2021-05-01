package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
    }

    public static void sum(int num1, int num2) {
        System.out.println("sum(int , int )");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3) {
        System.out.println("sum(int , int , int )");
        System.out.println("Result = " + (num1 + num2 + num3));
    }

    public static void sum(double num1, double num2) {
        System.out.println("sum(double, double)");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void sum(String str1, String str2) {
        System.out.println("sum(string, string)");
        System.out.println("Result = " + (str1 + str2));
    }
}
