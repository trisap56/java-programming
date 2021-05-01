package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("-------FIND INDEX OF 'Gloves' IN ITEMS ARRAY-------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;
            }
        }

        boolean ipadExists = false;
        System.out.println("-------SET BOOLEAN TO TRUE IF FIRST 'IPAD' IS FOUND-------");
        for (String item : items) {
            if (item.equals("iPad")) {
                ipadExists = true;
                break;
            }
        }
        System.out.println("ipadExists = " + ipadExists);
        if (ipadExists) {
            System.out.println("We bought the iPad!");
        } else {
            System.out.println("We forgot the iPad!");
        }
        System.out.println();

        System.out.println("-----Print a report of each shopping item-----");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + ": #" + itemIDs[i]);
        }

        System.out.println("----Look for 'Jacket' in items and print all details ---");
        /*
        Jacket - $150.0 - #12346
         */
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break; //stop searching after jacket is found
            }
        }
    }
}