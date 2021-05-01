package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";
        String username = "CYBERTEK";
        String password = "Abc123";

        if(expPassword.equals(password) && expUserName.equalsIgnoreCase(username)) {
            System.out.println("Pass - user successfully logged in");
        } else {
            if(expPassword != password)
            System.out.println("Incorrect password");
            if (expUserName != username) {
            System.out.println("Incorrect username");
            }

        }
    }
}
