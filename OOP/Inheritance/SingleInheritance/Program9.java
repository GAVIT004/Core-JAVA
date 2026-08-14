package Basicsjava.OOP.Inheritance.SingleInheritance;
class Collage{
    void colleageName(){
        System.out.println("SKNCOE");
    }
}
class EngineeringCollage extends Collage{
    void department(){
        System.out.println("Computer Engineering");
    }
}
public class Program9 {
    public static void main(String[] args){
        EngineeringCollage engineeringCollage=new EngineeringCollage();

       System.out.print("Collage Name: ");
       engineeringCollage.colleageName();
       System.out.println();
       System.out.print("Department: ");
       engineeringCollage.department();

    }
}
