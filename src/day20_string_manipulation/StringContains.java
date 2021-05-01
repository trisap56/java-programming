package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains(" | ")) {
            System.out.println("pass - title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "ahmed";
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both a && e are present");
        } else {
            System.out.println("a || e not present");
        }

        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        } else {
            System.out.println("nor a or i is present");
        }

        String email = "trisap56@gmail.com";
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }

        if (email.toLowerCase().contains("d")) {
            System.out.println("d is present");
        } else {
            System.out.println("d is not present");
        }

        String word = "java";
        System.out.println(word.replace("a" , "u"));

        String sentence = "java strings are fun";


    }
}
