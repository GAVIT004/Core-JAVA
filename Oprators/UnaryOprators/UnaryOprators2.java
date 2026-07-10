package Basicsjava.Oprators.UnaryOprators;

class Temperature{
    void makeNegative(int temp){
        System.out.println("Temperature: "+ -temp);
    }
    void makePositive(int temp){
        System.out.println("Temperature: "+ +temp);
    }
}
public class UnaryOprators2 {
    public static void main(String[]args){
        int temp=35;
        Temperature temperature=new Temperature();
        temperature.makeNegative(temp);
        temperature.makePositive(temp);

    }
}
