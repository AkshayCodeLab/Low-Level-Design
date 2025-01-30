import VehicleFactory.*;
public class AbstractVehicleFactory {
    public static VehicleFactory getFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("luxury")){
            return new LuxuryVehicleFactory();
        }else if (factoryType.equalsIgnoreCase("ordinary")) {
            return new OrdinaryVehicleFactory();
        }
        return null;
    }
}
