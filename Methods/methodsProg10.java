package Basicsjava.Methods;

import java.util.Scanner;

class Car{
    String brand;
    String model;
    int speed;

    void start(){
        System.out.println("A car brand "+brand+" model "+model+" start at speed of "+speed);
    }

    void acceleration(int increment){
        speed+=increment;
        System.out.println("A speed acceleration "+speed+" km/h");
    }

    int currentSpeed(){
        return  speed;
    }

    int incressSpeed(int increment){
        speed=speed-increment;
        return speed;
    }
}

public class methodsProg10
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Car car=new Car();
        System.out.println("Enter a car brand");
        car.brand=sc.next();
        System.out.println("Enter a car model");
        car.model=sc.next();
        System.out.println("Enter a car speed");
        car.speed=sc.nextInt();

        car.start();
        System.out.println("Enter a speed increment");
        int in=sc.nextInt();
        car.acceleration(in);
        System.out.println("Car current Speed:"+car.currentSpeed());
       System.out.println("Total spped incress"+ car.incressSpeed(in));
    }

}