package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
        int numOfBedrooms = 4;
        int startingPrice = 0;

        switch(numOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("5 bedroom currently available");
        }
        System.out.println("Starting price $" + startingPrice);

    }
}
