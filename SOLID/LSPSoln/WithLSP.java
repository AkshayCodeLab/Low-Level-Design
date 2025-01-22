package SOLID.LSPSoln;

import java.util.ArrayList;
import java.util.List;

interface Vehicle{
    int numberOfTyres();
}

class EngineVehicle implements Vehicle{

    @Override
    public int numberOfTyres() {
        return 4;
    }

    public Boolean hasEngine(){
        return true;
    }
}

class Bike implements Vehicle{

    @Override
    public int numberOfTyres() {
        return 2;
    }

}


public class WithLSP {
    public static void main(String[] args){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new EngineVehicle());
        vehicles.add(new Bike());

        vehicles.forEach(vehicle -> {
            // Gives the error
//            System.out.println(vehicle.hasEngine());
        });
    }
}
