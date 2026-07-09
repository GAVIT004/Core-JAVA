package Basicsjava.Oprators.TernarryOprators;

public class Program9 {
    public static void main(String[] args){
        int year=2024;
        String leapYear = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "Leap Year" : "Not a leap year";
        System.out.println(leapYear);

    }

}
