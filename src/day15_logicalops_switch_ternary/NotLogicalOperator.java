package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);

        int age = 20;
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat. age = " + age);
        }

        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("smoking is not allowed here. Exit.");
        }

        boolean isAffordable = false;
        if (!isAffordable) {
            System.out.println("Item not affordable");
        }

        String env = "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "tesla";
        if (!carModel.equals("tesla")) {
            System.out.println("Not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");
        }
    }
}
