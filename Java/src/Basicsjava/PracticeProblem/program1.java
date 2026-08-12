package Basicsjava.PracticeProblem;

import java.util.Scanner;

class Driver{

    void driverValid(String driverName,int driverAge,boolean hasLicense ){

        if(driverAge>18&&hasLicense){
            System.out.println(driverName+" you can drive the bike.");
        }else {
            System.out.println(driverName+" you cannot drive the bike!!!");
        }

    }
}

public class program1 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a driver name: ");
        String name=scanner.next();
        System.out.println("Enter a driver age: ");
        int age=scanner.nextInt();
        System.out.println("Enter a you have license true/false");
        boolean license=scanner.nextBoolean();

        Driver driver=new Driver();
        driver.driverValid(name,age,license);

    }

}
