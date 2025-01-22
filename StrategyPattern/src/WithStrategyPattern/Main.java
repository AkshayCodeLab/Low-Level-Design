package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle sportVehicle = new SportsVehicle();
        Vehicle passengerVehicle = new PassengerVehicle();

        sportVehicle.drive();
        passengerVehicle.drive();
    }
}