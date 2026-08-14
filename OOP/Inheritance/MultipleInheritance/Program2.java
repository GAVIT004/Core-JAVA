package Basicsjava.OOP.Inheritance.MultipleInheritance;

import java.util.Scanner;

interface GPS{
    default void showLocation(){
        System.out.println("Pune");
    }
}

interface Engine{
    default void startEngine(){
        System.out.println("Engine starting...");
    }
}

class Car implements GPS,Engine{
    String carCompany;
    String carModel;
    double carPrice;

    void getCar(String company,String model,double price){
        carCompany=company;
        carModel=model;
        carPrice=price;
    }

    void displayCar(){
        System.out.println("Car company: "+carCompany);
        System.out.println("Car Model: "+carModel);
        System.out.println("Car Price: "+carPrice);
        Engine.super.startEngine();
        GPS.super.showLocation();

    }
}
public class Program2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a car company: ");
        String company=scanner.nextLine();
        System.out.println("Enter a car model: ");
        String model=scanner.nextLine();
       // scanner.nextLine();
        System.out.println("Enter a car price: ");
        double price=scanner.nextDouble();
        Car car=new Car();
        car.getCar(company,model,price);
        car.displayCar();
    }
}
