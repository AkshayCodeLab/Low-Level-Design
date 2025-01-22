package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalStrategy());
    }
}
