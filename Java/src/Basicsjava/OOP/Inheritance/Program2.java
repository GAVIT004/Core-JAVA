package Basicsjava.OOP.Inheritance;

class Vehical{
    public void startEngine(){
        System.out.println("Vehical engine is start");
    }
}
class Car extends Vehical{
    @Override
    public void startEngine(){
        System.out.println("Car engine start with key");
    }
}
class Bike extends Vehical{
    @Override
    public void startEngine(){
        System.out.println("Bike start wit self-start");
    }
}
class Truck extends Vehical{
    @Override
    public void startEngine(){
        System.out.println("Truck engine start with heavy load");
    }
}
public class Program2 {
    public static void main(String[] args){
        Vehical vehical=new Vehical();
        vehical.startEngine();
        vehical=new Car();
        vehical.startEngine();
        vehical=new Bike();
        vehical.startEngine();
        vehical=new Truck();
        vehical.startEngine();
    }

}
