package day18_conditions_practice_strings_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
        int last4SSN = 1235;
        int pinCode = 4321;
        int expLast4SSN = 1234;
        int expPinCode = 4321;
        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful.");
        } else if (pinCode != expPinCode) {
            System.out.println("Pincode did not match. Try again.");
        } else if (last4SSN != expLast4SSN) {
            System.out.println("Last 4 of SSN did not match. Try again.");
        }
    }
}
