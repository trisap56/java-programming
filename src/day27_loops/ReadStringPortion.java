package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,black cat,red car";


        for (int i = 0; i < list.length() - 1; i++) {
            String part = list.substring(i, i + 3);
            System.out.println("part = " + part);
            if (part.equals("cat") || part.equals("car")) ;
            {
                System.out.println("cat or car found");
            }
        }

    }
}
