package Basicsjava.OOP.Inheritance.SingleInheritance;
class Vehicel{
    void startEngine(){
        System.out.println("Vehicel engine is start");
    }
}
class Car extends Vehicel{
    void drive(){
        System.out.println("Car is driving");
    }
}
public class Program2 {
    public static void main(String[] args){
        Car car=new Car();
        car.startEngine();
        car.drive();

    }
}
