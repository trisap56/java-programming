package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.endsWith("idea"));

        String name = "Irina";
        if (name.endsWith("a")) {
            System.out.println("Maybe it is a female name");
        }

        String firstName = "Dr. Nadir";
        if (firstName.startsWith("Dr")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mr")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Mrs")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Sr")) {
            System.out.println("Senior");
        }

        String url = "https://www.stackoverflow.com";
        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println("Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        }
    }
}
