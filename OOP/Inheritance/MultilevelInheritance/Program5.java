package Basicsjava.OOP.Inheritance.MultilevelInheritance;
class Vehicel{
    String vehicelNumber="MH08AH3753";
    String company="Mahindra";
}
class Car extends Vehicel{
    String model="XUV700";
    double price=2350000;
}
class ElectricCar extends Car{
    String battryCapacity="500km";
    int incuranceRate=5;

    void calculate(){
        double incuranceAmount=price*incuranceRate/100;
        double finalPrice=price+incuranceAmount;
        System.out.println("Incurance Amount: "+incuranceAmount);
        System.out.println("Final Price: "+finalPrice);
    }

    void displayFinalPrice(){
        System.out.println("-----Final Price-----");
        System.out.println("Vehicel Number: "+vehicelNumber);
        System.out.println("Vehicel Company: "+company);
        System.out.println("Vehicel Model: "+model);
        System.out.println("Vehicel Price: "+price);
        System.out.println("Vehicel Battry Capacity: "+battryCapacity);
        System.out.println("Vehicel Incurance Rate: "+incuranceRate+"%");

    }

}
public class Program5 {
    public static void main(String[] args){
        ElectricCar electricCar=new ElectricCar();
        electricCar.displayFinalPrice();
        electricCar.calculate();

    }
}
