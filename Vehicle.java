import java.util.Scanner;

class Vehicle {

    static double speed, fuel_consumed, distance;
    static int no_of_wheels;
    static String type;

    public static double calspeed() {

        double mileage = distance / fuel_consumed;

        return (mileage);

    }

    public static void displayinfo(double mileage) {

        System.out.println("\n\nVehicle Info--\n\nType: " +type+ "\nTop-speed: " +speed+ " km/hr\nNumber of wheels: " +no_of_wheels+ "\nDistance travelled: " +distance+ " km\nFuel Consumed: " +fuel_consumed+ " ltr\nMileage: " +mileage+ "kmpl" );

    }
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the type of Vehicle (gear: manual/automatic): ");
        type = in.next();
        System.out.println("Enter the top-speed of the Vehicle (in km/hr): ");
        speed = in.nextDouble();
        System.out.println("Enter the number or wheels of the Vehicle: ");
        no_of_wheels = in.nextInt();
        System.out.println("Enter the distance travelled by the Vehicle (in km): ");
        distance = in.nextDouble();
        System.out.println("Enter the amount of fuel consumed (in ltr): ");
        fuel_consumed = in.nextDouble();

        in.close();

        double mileage = calspeed();
        displayinfo(mileage);

    }

}