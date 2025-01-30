package VehicleFactory;

import Vehicles.*;

public class OrdinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("OrdinaryVehicle1")) {
            return new OrdinaryVehicle1();
        } else if (vehicleType.equalsIgnoreCase("OrdinaryVehicle2")) {
            return new OrdinaryVehicle2();
        }
        return null;
    }
}
