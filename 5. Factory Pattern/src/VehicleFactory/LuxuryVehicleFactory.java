package VehicleFactory;

import Vehicles.LuxuryVehicle1;
import Vehicles.LuxuryVehicle2;
import Vehicles.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("LuxuryVehicle1")) {
            return new LuxuryVehicle1();
        } else if (vehicleType.equalsIgnoreCase("LuxuryVehicle2")) {
            return new LuxuryVehicle2();
        }
        return null;
    }
}
