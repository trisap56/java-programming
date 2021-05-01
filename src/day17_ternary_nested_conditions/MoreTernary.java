package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);
        System.out.println();

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Murodil/Saim" : "Nadir";
        System.out.println("teacher = " + teacher);
        System.out.println();

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "can drive" : "cannot drive";
        System.out.println("driving = " + driving);
    }
}
