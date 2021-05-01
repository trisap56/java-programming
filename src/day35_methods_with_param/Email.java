package day35_methods_with_param;

public class Email {

    public static void main(String[] args) {
        buildEmail("tristan","gmail");
        buildEmail("saim","cybertekschool");
        buildEmail("murodil","facebook");


    }

    public static void buildEmail(String name, String domain){
        String email =name + "@" + domain + ".com";
        System.out.println(email);
    }
}
