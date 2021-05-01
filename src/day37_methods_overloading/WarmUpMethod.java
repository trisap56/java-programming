package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        System.out.println("Enter username & password:");
        loginVoid("cybertekStudent", "abc123"); //POSITIVE TEST / SUNNY DAY SCENARIO
        loginVoid("cybertek", "anwser"); //NEGATIVE TEST / RAINY DAY SCENARIO
        System.out.println(login("cybertekStudent", "abc123"));
        if (login("cybertekStudent", "abc123")) {
            System.out.println("Login successful, welcome cybertek student!");
        } else {
            System.out.println("Incorrect username or password");

        }
    }

    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if (username.equalsIgnoreCase(secretUsername) && password.equalsIgnoreCase(secretPassword)) {
            System.out.println("Login successful, welcome cybertek student!");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if (username.equalsIgnoreCase(secretUsername) && password.equalsIgnoreCase(secretPassword)) {
            return true;
        } else {
            return false;
        }
    }


}