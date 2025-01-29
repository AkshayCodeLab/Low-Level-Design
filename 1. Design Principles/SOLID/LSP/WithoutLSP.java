package SOLID.LSP;


/* The child class should only extend the functionality of the parent class,
not narrow it down.

If B is child class of A, then replacing A with B in the code should not be breaking the code.

Here if you substitute Bike with bycycle then it breaks the code on turnOnEngine()
* */

interface Bike {
    void turnOnEngine();
    void accelerate();
}

class Motorcycle implements Bike{

    @Override
    public void accelerate() {
        System.out.println("Accelerate motorcycle");
    }

    @Override
    public void turnOnEngine(){
        System.out.println("Turn engine on");
    }
}

class Bycycle implements Bike{

    @Override
    public void turnOnEngine() {
        try {
            throw new Exception("Engine in the bike doesn't exits");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating bike");
    }
}

public class WithoutLSP {
}
