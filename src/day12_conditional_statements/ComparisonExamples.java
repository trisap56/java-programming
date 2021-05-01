package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        double currentSpeed = 45 ;
        double speedLimit = 55 ;
        boolean isSpeeding = currentSpeed > speedLimit ;
        System.out.println("Are you speeding? - " + isSpeeding) ;
        System.out.println("currentSpeed = " + currentSpeed + "mph") ;
        System.out.println("speedLimit = " + speedLimit + "mph") ;
        System.out.println("") ;

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit ;
        System.out.println("Are you speeding? - " + isSpeeding) ;
        System.out.println("currentSpeed = " + currentSpeed + "mph") ;
        System.out.println("speedLimit = " + speedLimit + "mph") ;
        System.out.println("") ;

        double accountBalance = 250.25;
        double itemPrice = 100;
       // boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can you afford? - " + (accountBalance >= itemPrice));
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);
        
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);

        
        

    }
}
