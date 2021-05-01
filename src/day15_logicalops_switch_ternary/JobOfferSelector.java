package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        double salary = 120_000;
        boolean isRemote = true;
        boolean hasBenefits = true;
        String location = "Colorado Springs, CO";
        if (isRemote && salary == 120_000) {
            System.out.println("I am interested in this job");
        } else {
            System.out.println("I am not interested in this job");
        }
    }
}
