package Basicsjava.PracticeProblem.Day2;

import java.util.Scanner;

class Time{

    Long seconds;

    public Time(Long seconds) {
        this.seconds = seconds;
    }

    Long hours(){
        return seconds/3600;
    }

    Long minutes(){
        return (seconds%3600)/60;
    }

    Long Seconds(){
        return seconds%60;
    }
}

public class TimeConversionSystem {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter total seconds: ");
        Long seconds=scanner.nextLong();

        if (seconds<0){
            System.out.println("Invalid input");
            System.exit(0);
        }

        Time time=new Time(seconds);

        System.out.println("Hours: "+time.hours());
        System.out.println("Minutes: "+time.minutes());
        System.out.println("Seconds: "+time.Seconds());
    }
}
