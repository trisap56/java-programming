package day07_arithmetic_operators_casting;

public class Apartment {
    public static void main(String[] args){
        String address = "28690 Cole dr";
        String nameOfOwner = "Tristan Pasha";
        int numberOfUnits =12;
        int numberOfWashersAndDriers =2;
        double averageSizeOfEachUnit =2000;
        double monthlyRentAmount =2100;
        boolean allowsPets = true;
        boolean hasPool = false;
        int lengthOfLease =2;
        double totalNumberOfResidentsInBuilding =24;
        float phoneNumberOfOwner = 7039996697F;
        boolean isNearAGasStation = true;
        int numberOfFloors = 3;
        boolean hasABasement = true;
        boolean hasAirConditioning = true;
        int numberOfParkingSpots = 60;
        boolean hasWheelChairAccess = false;
        int numberOfReviewStars = 4;

        double monthlyRentAfter3Years = monthlyRentAmount * .9;
        System.out.println("monthlyRentAfter3Years = " + monthlyRentAfter3Years);
        double monthlyRentAfter6Years = monthlyRentAmount * .8;
        System.out.println("monthlyRentAfter6Years = " + monthlyRentAfter6Years);
        double averageNumberOfResidentsPerUnit = totalNumberOfResidentsInBuilding / numberOfUnits;
        System.out.println("averageNumberOfResidentsPerUnit = " + averageNumberOfResidentsPerUnit);
        double averageNumberOfParkingSpotsPerUnit = numberOfParkingSpots / numberOfUnits;
        System.out.println("averageNumberOfParkingSpotsPerUnit = " + averageNumberOfParkingSpotsPerUnit);
        double averageNumberOfUnitsPerFloor = numberOfUnits / numberOfFloors;
        System.out.println("averageNumberOfUnitsPerFloor = " + averageNumberOfUnitsPerFloor);






    }
}
