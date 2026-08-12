package Basicsjava.AccessModifiers.ClassLevelModifiers.AbstractModifiers;

/*class Vehicle{

    abstract public void getNoOfWheel();

    Basicsjava.AccessModifiers.ClassLevelModifiers.AbstractModifiers.Vehicle is not abstract and does not override abstract method getNoOfWheel() in Basicsjava.AccessModifiers.ClassLevelModifiers.AbstractModifiers.Vehicle
}*/

abstract class Vehicle{

    abstract public int getNoOfWheel();
}

/*class Bus extends Vehicle{

    Class 'Bus' must either be declared abstract or implement abstract method 'getNoOfWheel()' in 'Vehicle'
}*/

class Bus extends Vehicle{

    @Override
    public int getNoOfWheel() {
        return 7;
    }
}

class Auto extends Vehicle{

    public int getNoOfWheel(){

       return 3;
    }
}
public class Program2 {

    public static void main(String[] args) {

        Bus bus=new Bus();
        bus.getNoOfWheel();

        Auto auto=new Auto();
        auto.getNoOfWheel();
    }
}
