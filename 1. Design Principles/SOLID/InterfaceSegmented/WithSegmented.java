package SOLID.InterfaceSegmented;


/* *

Definition: Interfaces should be such, the client should not implement the unnecessary
function.

Now waiter only implements serve and clean.
Chef only implements the cook function
Earlier waiter has to implement cook as well which was not needed.

 */

interface WaiterInterface{
    void serveFood();
    void cleanDishes();
}

interface ChefInterface{
    void cookFood();
}

class WaiterEmployee implements WaiterInterface{

    @Override
    public void serveFood() {

    }

    @Override
    public void cleanDishes() {

    }
}

class Chef implements ChefInterface{

    @Override
    public void cookFood() {

    }
}


public class WithSegmented {
}
