package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(12,197));
        double sum = add(12,197);
        System.out.println("sum = " + sum);
        System.out.println(minus(12,197));
        System.out.println(multiply(12,197));
        System.out.println(divide(12,197));

    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(double num1, double num2) {
        double difference = num1 - num2;
        return difference;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result2 = num1 / num2;
        return result2;
    }


}
