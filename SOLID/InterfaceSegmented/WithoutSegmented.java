package SOLID.InterfaceSegmented;

interface RestaurantEmployee{
    void serveFood();
    void cookFood();
    void cleanDishes();
}

class Waiter implements RestaurantEmployee{

    @Override
    public void serveFood() {
        System.out.println("Serving Food");
    }

    @Override
    public void cookFood() {
        // Not needed. Waiter doesn't need food. Still has to implement this method as per the interface.
        // Bad interface design.
    }

    @Override
    public void cleanDishes() {
        System.out.println("Cleaning Dishes");
    }
}

public class WithoutSegmented {
}
