package Basicsjava.Variables.InstanceVariables;

import java.util.Scanner;

class MovieTicket{
    String movieName;
    String customerName;
    int seatNumber;
    int numberOfSeat;
    double ticketPrice;


    void getMovieTicket(String movie,String customer,int num,int seat,double price){
        movieName=movie;
        customerName=customer;
        seatNumber=num;
        numberOfSeat=seat;
        ticketPrice=price;
    }
    double totalAmount;
    void calculateAmount(){
        totalAmount=numberOfSeat*ticketPrice;
    }

    void displayMovieTicket(){
        System.out.println("Movie name: "+movieName);
        System.out.println("Customer name: "+customerName);
        System.out.println("Seat number: "+seatNumber);
        System.out.println("total booked ticket: "+numberOfSeat);
        System.out.println("Ticket price: "+ticketPrice);
        System.out.println("Total ticket price: "+totalAmount);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of customers ");
        int numCustomer=scanner.nextInt();
        for (int i=0;i<=numCustomer;i++){
            System.out.println("Enter a movie name: ");
            String movie=scanner.nextLine();
            scanner.nextLine();
            System.out.println("Enter a customer name: ");
            String customer=scanner.nextLine();
            scanner.nextLine();
            System.out.println("Enter a seat number: ");
            int num=scanner.nextInt();
            System.out.println("Enter a number of seat: ");
            int seat=scanner.nextInt();
            System.out.println("Enter a ticket price: ");
            double price=scanner.nextDouble();
            MovieTicket movieTicket=new MovieTicket();
            movieTicket.getMovieTicket(movie,customer,num,seat,price);
            movieTicket.calculateAmount();
            movieTicket.displayMovieTicket();
        }
        scanner.close();
    }
}
