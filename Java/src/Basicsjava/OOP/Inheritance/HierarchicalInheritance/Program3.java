package Basicsjava.OOP.Inheritance.HierarchicalInheritance;

class Vehicle{
    String showroomName="Aditya Motors";
    String companyName="BMW";

    void displayShowroom(){
        System.out.println("Showroom Name:"+showroomName);
        System.out.println("Comany Name: "+companyName);
    }
}

class Car extends Vehicle{
    String modelName="BMW M5 ";
    double price=35000000;
    int insuranceRate=55;

    void finalPrice(){
        double insurancePrice=(price*insuranceRate)/100;
        double finalPrice=price+insurancePrice;
        System.out.println("Final Price: "+finalPrice);
    }

    void displayCar(){
        System.out.println("Model Name: "+modelName);
        System.out.println("Price : "+price);
        System.out.println("Insurance Rate: "+insuranceRate+"%");
    }
}

class Bike extends Vehicle{
    String modelName="1350R GS";
    double price=3500000;
    int insuranceRate=18;

    void finalBill(){
        double insuranceAmmount=(price*insuranceRate)/100;
        double finalBill=price+insuranceAmmount;
        System.out.println("Final Price: "+finalBill);
    }

    void displayBike(){
        System.out.println("Model Name: "+modelName);
        System.out.println("Price : "+price);
        System.out.println("Insurance Rate: "+insuranceRate+"%");
    }
}

class Truck extends Vehicle{
    String modelName="get500T";
    int loadcapacity=500;
    double price=50000000;
    int roadTax=25;

    void finalPrice(){
        double roadTaxPrice=(price*roadTax)/100;
        double totalfinalPrice=price+roadTaxPrice;
        System.out.println("Final Price: "+totalfinalPrice);
    }

    void displayTruck(){
        System.out.println("Model Name: "+modelName);
        System.out.println("Load Capacity: "+loadcapacity);
        System.out.println("Price "+price);
        System.out.println("Road Tax: "+roadTax);
    }
}

public class Program3 {
    public static void main(String[] args){
        System.out.println("---CAR---");
        Car car=new Car();
        car.displayShowroom();
        car.displayCar();
        car.finalPrice();
        System.out.println("---BIKE---");
        Bike bike=new Bike();
        bike.displayShowroom();
        bike.displayBike();
        bike.finalBill();
        System.out.println("---TRUCK---");
        Truck truck=new Truck();
        truck.displayShowroom();
        truck.displayTruck();
        truck.finalPrice();
    }
}
