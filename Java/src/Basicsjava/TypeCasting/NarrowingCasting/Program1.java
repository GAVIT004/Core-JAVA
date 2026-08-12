package Basicsjava.TypeCasting.NarrowingCasting;

public class Program1 {
    public static void main(String[] args) {
        int maxScore=500;
        int userScore=423;
        double percentage=(double) userScore/maxScore*100.0;
        System.out.println("User percentage: "+percentage);
    }
}
