package Basicsjava;

import java.util.Scanner;

class Student {
    String StdName;
    int StdAge;

    void display() {
        System.out.println("Student Name:  " + StdName);
        System.out.println("Student Age:  " + StdAge);
    }

}

class Car{
    String brand;

    void start(){
        System.out.println(brand+"  car starting");
    }

}

class Employee{
    String empName;
    int empId;

     Employee(String n,int id){
         empName=n;
         empId=id;

    }

    void displayEmp(){
         System.out.println("Emplyooe Name:  "+empName);
         System.out.println("Emplyooe Id:  "+empId);
    }
}

class Moblie{
    String companyName;
    int price;

    void displaymbl(){
        System.out.println("Mpbile company  "+companyName+"  price =  "+price);
    }
}

class Rectangle{
    double width;
    double Hieght;

    double area(){
        return width*Hieght;

    }
}

class Book{
    String bookTitle;
    String bookAuther;

    void displayBook(){
        System.out.println("Book Title:  "+bookTitle);
        System.out.println("Book Auther:  "+bookAuther);
    }
}

class Bank{
    String bankAccountName;
    int bankAccNum;
    double bandbalance;

    void displayBank(){
        System.out.println("Bank Name:  "+bankAccountName);
        System.out.println("Bank Account Number: "+bankAccNum);
        System.out.println("Bank Balance:  "+bandbalance);
    }
}

class Circle{
    double radius;

    double areacircle(){
        return 3.14*radius*radius;
    }
}

class Laptops{
    String lapBrand;
    String specifications;

    void displayLap(){
        System.out.println("Laptop name:   "+lapBrand+"Specifications:  "+specifications);
    }
}

class Person{
    String personName;
    int personAge;

    Person(String name,int Age){
        personName=name;
        personAge=Age;

    }

    void displayPerson(){
        System.out.println("Person Name is  "+personName+" and Age is   "+personAge);
    }
}


public class BasicjavaClassObj {


    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        Student std=new Student();
        System.out.println("Enter Student Name:  ");
        std.StdName=sc.next();
        System.out.println("Enter Student Age:  ");
        std.StdAge= sc.nextInt();

        std.display();

        Car car= new Car();
        System.out.println("Enter a Car Brand:  ");
        car.brand=sc.next();
        car.start();

        System.out.println("Enter emplooye details please");
        Employee emp=new Employee(sc.next(),sc.nextInt());
        emp.displayEmp();

        Moblie mbl1=new Moblie();
        System.out.println("Enter a Mobile Name: ");
        mbl1.companyName=sc.next();
        System.out.println("Enter a Mobile price : ");
        mbl1.price= sc.nextInt();
        mbl1.displaymbl();

        Moblie mbl2=new Moblie();
        System.out.println("Enter a Mobile Name: ");
        mbl2.companyName= sc.next();
        System.out.println("Enter a Mobile price : ");
        mbl2.price= sc.nextInt();
        mbl2.displaymbl();

        Rectangle rectangle=new Rectangle();
        System.out.println("Enter a Hieght of rectangle : ");
        rectangle.Hieght= sc.nextDouble();
        System.out.println("Enter a Width of rectangle : ");
        rectangle.width= sc.nextDouble();
        System.out.println("Area of Rectangle:  "+rectangle.area());

        Book book= new Book();
        System.out.println("Enter a Book Title : ");
        book.bookAuther= sc.next();
        System.out.println("Enter a Book Auther ");
        book.bookTitle= sc.next();
        book.displayBook();

        Bank bank=new Bank();
        System.out.println("Enter a Bank Balance:  ");
        bank.bandbalance= sc.nextDouble();
        System.out.println("Enter a Bank Account Number:  ");
        bank.bankAccNum= sc.nextInt();
        System.out.println("Enter a Bank Name:  ");
        bank.bankAccountName= sc.next();
        bank.displayBank();

        Circle circle=new Circle();
        System.out.println("Enter a Radius of circle:  ");
        circle.radius= sc.nextDouble();
        System.out.println("Area of Circle :  "+circle.areacircle());

        Laptops lap1=new Laptops();
        System.out.println("Enter a Laptop name:  ");
        lap1.lapBrand= sc.next();
        System.out.println("Enter a Laptop specifications:  ");
        lap1.specifications= sc.next();
        lap1.displayLap();

        Laptops lap2=new Laptops();
        System.out.println("Enter a Laptop name:  ");
        lap2.lapBrand= sc.next();
        System.out.println("Enter a Laptop specifications:  ");
        lap2.specifications= sc.next();
        lap2.displayLap();

        System.out.println("Enter a Person Detail:  ");
        Person person=new Person("Gavit",32);
        person.displayPerson();








    }
}

