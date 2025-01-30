import VehicleFactory.VehicleFactory;
import Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory luxuryFactory = AbstractVehicleFactory.getFactory("luxury");
        Vehicle luxuryVehicle1 = luxuryFactory.createVehicle("LuxuryVehicle1");

        luxuryVehicle1.drive();
    }
}