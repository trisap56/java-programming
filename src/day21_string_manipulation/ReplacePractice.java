package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" " , "");
        sentence = sentence.replace("java", "selenium").replace("fun","a lot of fun");
        System.out.println("withNoSpaces = " + withNoSpaces);
        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ","")
                       .replace(",","")
                       .replace(" results for java book","");
        System.out.println("result = " + result);

    }
}
