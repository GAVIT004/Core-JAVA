package Basicsjava.OOP.Inheritance.SingleInheritance;
class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape{
    void calculateArea(){
        System.out.println("Calculating circle area");
    }
}
public class Program7 {
    public static void main(String[] args){
        Circle circle=new Circle();
        circle.draw();
        circle.calculateArea();

    }
}
