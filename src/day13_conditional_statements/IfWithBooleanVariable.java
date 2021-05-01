package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry == true) {
            System.out.println("I am hungry, I will go get something to eat!\n" + "Then code java!");
        } else {
            System.out.println("I am not hungry, I will keep coding java.");
        }


        double price = 130.44;
        boolean isAffordable = 200>= price;

        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it, lets buy it!");
        } else {
            System.out.println("Too expensive, lets keep coding java");
        }


        boolean isRemoteJob = true;
        if (!isRemoteJob) {
            System.out.println("Sure I am interested, what is the interview process?");
        } else {
            System.out.println("Sorry I am not interested");
        }


    }
}
