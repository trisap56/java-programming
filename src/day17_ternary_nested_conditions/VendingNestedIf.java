package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drinkItem = "coke";
        String snackItem = "cookies";

        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea is selected");
            } else {
                System.out.println("coke is selected");
            }
        } else if (selection.equals("snack"))
            System.out.println("snack option is selected");
        if (snackItem.equals("chips")) {
            System.out.println("chips is selected");
        } else {
            System.out.println("cookies is selected");
        }
    }

}


