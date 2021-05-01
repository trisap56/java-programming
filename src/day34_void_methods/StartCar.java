package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        sitInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }

    public static void pressGasPedal(){
        System.out.println("4. Press down on the gas pedal");
    }

    public static void sitInCar() {
        System.out.println("1. Open the door and sit in the driver seat");
    }

    public static void startTheCar(){
        System.out.println("2. Insert key to ignition and turn clockwise");
    }

    public static void shiftToDrive(){
        System.out.println("Press brake pedal and shift to 'D'");
    }
}

