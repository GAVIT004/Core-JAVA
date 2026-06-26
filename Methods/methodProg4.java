package Basicsjava.Methods;

import java.util.Scanner;

class Circle{
    double radius;

    void acceptData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius=sc.nextDouble();
    }

    void displayData(){
        System.out.println("Radius of circle: "+radius);
    }

    double area(){
        return Math.PI*radius*radius;
    }

    double circumfarance(double r){
        return 2*Math.PI*r;
    }

}

public class methodProg4 {
    public static void main(String[]args){
        Circle circle=new Circle();
        circle.acceptData();
        circle.displayData();
        System.out.println("Area of circle: "+circle.area());
        System.out.println("Circumfarance of circle: "+circle.circumfarance(circle.radius));

    }

}
