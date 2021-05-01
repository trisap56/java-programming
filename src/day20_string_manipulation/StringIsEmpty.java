package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.equalsIgnoreCase(""));
        System.out.println(jobTitle.length());

        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please respond");
        } else {
            System.out.println("job title looks good");
        }

        if (jobTitle.length() == 0) {
            System.out.println("jobTitle is empty");
        } else {
            System.out.println("job title is not empty");
        }

        System.out.println(jobTitle.equals(""));

        if ("".equals(jobTitle)) {
            System.out.println("Job title is empty");
        } else {
            System.out.println("job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrot";
        System.out.println(veggie.isEmpty());
        if(!veggie.isEmpty()) {
            System.out.println("we have " + veggie);
        }

        String word2;
        //System.out.println(word2.isEmpty());
    }
}
