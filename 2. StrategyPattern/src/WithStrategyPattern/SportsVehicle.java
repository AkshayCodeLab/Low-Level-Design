package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;
import WithStrategyPattern.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
