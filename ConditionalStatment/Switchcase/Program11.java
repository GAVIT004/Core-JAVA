package Basicsjava.ConditionalStatment.Switchcase;

import java.util.Scanner;

public class Program11 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Navratri day please: ");
        int day=scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Color is White");
                break;
            case 2:
                System.out.println("Color is RED");
                break;
            case 3:
                System.out.println("Color is BLUE");
                break;
            case 4:
                System.out.println("Color is YELLOW");
                break;
            case 5:
                System.out.println("Color is GREEN");
                break;
            case 6:
                System.out.println("Color is GREY");
                break;
            case 7:
                System.out.println("Color is ORANGE");
                break;
            case 8:
                System.out.println("Color is PEACOCK GREEN");
                break;
                case 9:
                System.out.println("Color is PINK");
                break;
            default:
                System.out.println("Invalid Input");

        }

    }
}
