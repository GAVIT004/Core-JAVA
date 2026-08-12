package Basicsjava.OOP;
class Vehicle1{
    Vehicle1() {
        System.out.println("This is a Vehicle");
    }
}

class Car1 extends Vehicle {
    Car1() {
        System.out.println("This Vehicle is Car");
    }
}

class Bus extends Vehicle {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}
public class Program4 {


    public static void main(String[] args) {
        Car1 obj1 = new Car1();
        Bus obj2 = new Bus();
    }
}

