package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(97);
        displayValue(12);
        displayValue(64);
        int count = 55;
        displayValue(count);
        greetByName("Murodil");
        greetByName("Nadir");
        String name = "Suleyman";
        greetByName(name);

    }

    public static void displayValue(int num) {
        System.out.println("value is " + num);
    }

    public static void greetByName(String name) {
        System.out.println("Hello " + name + ", how are you today?");
    }
}
