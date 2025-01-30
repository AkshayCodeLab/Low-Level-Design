package VehicleFactory;

import Vehicles.Vehicle;

public interface VehicleFactory {
   public Vehicle createVehicle(String vehicleType);
}
