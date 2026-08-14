package Basicsjava.OOP.Inheritance.HybridInheritance;

import java.util.Scanner;

class Vehicle{
    String vehicleCompany;
    String vehicleModel;

    void getVehicle(String company,String model){
        vehicleCompany=company;
        vehicleModel=model;
    }

    void displayVehicle(){
        System.out.println("Vehicle company: "+vehicleCompany);
        System.out.println("Vehicle model: "+vehicleModel);
    }
}

interface GPS{
    default void liveLocation(){
        System.out.println("PUNE");
    }
}

interface MusicSystem{
    default void playMusic(){
        System.out.println("Music is playing....");
    }
}

class Car extends Vehicle implements GPS,MusicSystem{
    double carPrice;
    String carfuleType;

    void getCar(double price,String fuleType){
        carPrice=price;
        carfuleType=fuleType;
    }

    void displayCar(){
        System.out.println("Car price: "+carPrice);
        System.out.println("Car fule type: "+carfuleType);
        GPS.super.liveLocation();
        MusicSystem.super.playMusic();
    }
}
public class Program2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a vehicle company name: ");
        String vehiName=scanner.nextLine();
        System.out.println("Enter a vehicle model name: ");
        String vehimodel=scanner.nextLine();
        System.out.println("Enter a car price: ");
        double price=scanner.nextDouble();
        System.out.println("Enter a car fule type:");
        String fule=scanner.next();
        Car car=new Car();
        car.getVehicle(vehiName,vehimodel);
        car.getCar(price,fule);
        car.displayVehicle();
        car.displayCar();
        scanner.close();
    }
}
