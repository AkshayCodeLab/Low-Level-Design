package SOLID.LSP;

interface TwoWheeler {
    void accelerate();
}

interface EngineBike extends TwoWheeler {
    void turnOnEngine();
}

class MotorBike implements EngineBike{

    @Override
    public void turnOnEngine(){
        System.out.println("Engine Bike Turned on!");
    }

    @Override
    public void accelerate() {
        System.out.println("Engine Bike accelerating");
    }
}

class Bycyle implements TwoWheeler {

    @Override
    public void accelerate() {
        System.out.println("Accelerating Bycyle Bike!");
    }
}


public class WithLSP {

    public static void main(String[] args){

        /* If you substitute TwoWheeler to Bycycle the code will not break */

        TwoWheeler bycycle = new Bycyle();
        EngineBike motorbike = new MotorBike();

        motorbike.accelerate();
        bycycle.accelerate();
    }
}
