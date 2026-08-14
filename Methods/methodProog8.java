package Basicsjava.Methods;

import java.util.Scanner;

class Movies{
    String movieName;
    double ticketPrice;
    int numberOfTickets;

   void displayMoveDetail() {
       System.out.println("Movie name: "+movieName);
       System.out.println("Movie ticket price: "+ticketPrice);
       System.out.println("Movie number of tickets: "+numberOfTickets);
    }

    void bookTickets(int tickets){
       numberOfTickets=numberOfTickets-tickets;
       System.out.println("Remaining tickets: "+numberOfTickets);
    }

    double totalAmount(){
       return numberOfTickets*ticketPrice;
    }

    double discount(double discount){
       if(numberOfTickets<10){
           System.out.println("No discount");
           return ticketPrice;
       }
       double discountPrice=(ticketPrice*discount)/100;
       return ticketPrice-discountPrice;
    }

}
public class methodProog8 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Movies movie=new Movies();
        System.out.println("Enter a movie name:");
        movie.movieName=scanner.next();
        System.out.println("Enter a movie ticket price:");
        movie.ticketPrice=scanner.nextDouble();
        System.out.println("Enter a number of movie tickets:");
        movie.numberOfTickets=scanner.nextInt();
        movie.displayMoveDetail();
        System.out.println("Enter a movie ticktes you want:");
        int tickets=scanner.nextInt();
        movie.bookTickets(tickets);
        System.out.println("Total Amount: "+ movie.totalAmount());
        System.out.println("Enter a discount");
        int discount=scanner.nextInt();
        System.out.println("Discountes Amount"+ movie.discount(discount));




    }
}
