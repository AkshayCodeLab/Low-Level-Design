package SOLID.DependencyInjection;

/*
The class should depend on the interfaces and not on the concrete classes
 */

interface keyboard{

}

class WiredKeyboard implements keyboard{

}

class BluetoothKeyboard implements keyboard{

}

interface Mouse{

}

class WiredMouse implements Mouse{

}

class BluetoothMouse implements Mouse{

}

/*
Dependency on the concrete classes. if you later decided to change the WiredKeyboard
to wireless, it will be a mess.
 */
public class WithoutDI {
    WiredKeyboard keyboard;
    WiredMouse mouse;

    public WithoutDI(WiredKeyboard keyboard, WiredMouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

}

/*
Loose coupling. No matter if the client uses wireless keyboard or wired keyboard,
our code will work perfectly and the classes won't need any changes.
 */
class WithDI {
    keyboard keyboard;
    Mouse mouse;

    public WithDI(keyboard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

}
