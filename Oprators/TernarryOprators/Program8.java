package Basicsjava.Oprators.TernarryOprators;

public class Program8 {
    public static void main(String[] args){
        int a=12;
        int b=30;
        int c=18;
        int smallest=(a<b)?((a<c)?a:c):((b<c)?b:c);
        System.out.println(smallest);
    }
}
