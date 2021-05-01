package day34_void_methods;

public class EtsySearchTest {

    public static void main(String[] args) {
        System.out.println("--Starting ETSY Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResult();
        System.out.println("--ETSY Search Smoke Test completed - Pass --");

    }

    public static void openBrowser() {
        System.out.println("Launching Chrome browser");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("Navigating to hhtps://www.Etsy.com/");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");
    }

    public static void verifyResult(){
        System.out.println("PASS: Search results are successfully displayed");
    }

}
