package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title ="Java SDET";
        String company ="Palo Alto Networks";
        String jobDescription ="Experience in Java, Selenium, Cucumber, Tomato, JUnit";
        String salary ="123000";
        byte yearsExp = 3;
        boolean hasBenefits = true;

        System.out.println("Title: " + title);
        System.out.println("Company: " + company);
        System.out.println("Description: " + jobDescription);
        System.out.println("Salary: " + salary);
        System.out.println("Years of experience: " + yearsExp);
        System.out.println("Has benefits? " + hasBenefits);
    }
}
