package Basicsjava.Methods;

import java.util.Scanner;

class Rectangle{
    double length;
    double width;

    void acceptDimentions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lenght: ");
        length=sc.nextDouble();
        System.out.println("Enter a Width");
        width=sc.nextDouble();

    }

    void displayData(){
        System.out.println("Length of reactangle: "+length);
        System.out.println("Width of reactangle: "+width);
    }

    double area(){
        return length*width;
    }

    double perimeter(double l,double w){
        return 2*(l+w);
    }
}

public class methodProg3 {
    public static void main(String[]args){
        Rectangle rec=new Rectangle();
        rec.acceptDimentions();
        rec.displayData();
        System.out.println("Area of rectangle: "+rec.area());
        System.out.println("Perimeter of rectangle: "+rec.perimeter(rec.length, rec.width));


    }

}
