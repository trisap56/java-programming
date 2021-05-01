package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        System.out.println(word.toLowerCase());

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
