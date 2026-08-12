package Basicsjava.PracticeProblem;

import java.util.Scanner;

class Parking{
    int slots;
    String[] parkingSlot;
    String vehicleNumber;

    void getParking(int slot){
        slots=slot;
        parkingSlot=new String[slot];
    }
    void parkVehicle(Scanner scanner){
        System.out.println("Enter parking vehicle number: ");
        vehicleNumber=scanner.next();

        boolean parked=false;

        for (int i=0;i<parkingSlot.length;i++){
            if(parkingSlot[i]==null) {
                parkingSlot[i]=vehicleNumber;
                System.out.println("Vehicle parked successfully");
                System.out.println("Parking slot "+(i+i));

                parked=true;
                break;
            }

            if(!parked){
                System.out.println("Parking is full");
            }
        }
    }

    void removeVehicle(Scanner scanner){
        System.out.println("Enter a vehicle number to remove: ");
        vehicleNumber=scanner.next();

        boolean found=false;

        for (int i=0;i<parkingSlot.length;i++){

            if (vehicleNumber.equals(parkingSlot[i])){
                parkingSlot[i]=null;
                System.out.println("Vehicle removed successfully");

                found=true;
                break;
            }

            if(!found){
                System.out.println("Vehicle not found:");
            }
        }
    }

    void showParkingSlots(Scanner scanner){
        System.out.println("===ParkingSlot===");

        for (int i=0;i<parkingSlot.length;i++){

           if(parkingSlot[i]==null){
              System.out.println("Slot "+(i+1)+" Empty");
           }else {
               System.out.println("Slot "+(i+1)+" : "+parkingSlot[i]);
           }
        }
    }
}
public class Program10 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a total parking slots:");
        int slot=scanner.nextInt();

        Parking parking=new Parking();
        parking.getParking(slot);



        int choice;
        do {
            System.out.println("1.Park Vehicle");
            System.out.println("2. Remove vehicle");
            System.out.println("3. Show parking slot");
            System.out.println("4. Exit");

            System.out.println("Enter a yor choice: ");
            choice=scanner.nextInt();

            switch (choice){
                case 1:
                    parking.parkVehicle(scanner);
                    break;
                case 2:
                    parking.removeVehicle(scanner);
                    break;
                case 3:
                    parking.showParkingSlots(scanner);
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Please enter valid choice");
            }

        }while (choice!=4);
    }
}
