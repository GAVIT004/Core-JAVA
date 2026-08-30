package Basicsjava.AccessModifiers.MemberLevelModifiers.FinalVariable;

public class Program4 {

    public static void main(String[] args) {

        main1(10,20);
    }

    public static void main1(final int a,int b) {

       // a=100;  Cannot assign a value to final variable 'a'
        b=200;

        System.out.println(a+" "+b);
    }
}
