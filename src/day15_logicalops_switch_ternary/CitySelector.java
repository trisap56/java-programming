package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class with " + teacher);
        } else {
            System.out.println("Soft skills class with " + teacher);
        }

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skills class with " + teacher);
        } else {
            System.out.println("");
        }

        String company = "Cookies";
        double salary = 100_000;
        if ( company.equals("Cookies") || salary >= 100_000) {
            System.out.println("accept offer");
        } else {
            System.out.println("decline offer");
        }
    }
}
