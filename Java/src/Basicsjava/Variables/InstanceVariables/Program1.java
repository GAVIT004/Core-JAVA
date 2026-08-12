package Basicsjava.Variables.InstanceVariables;
class Mobile{
    String mobileBrand;
    String mobileModel;
    double mobilePrice;
    int mobileStorage;

    void displayMobile(){
        System.out.println("Mobile brand: "+mobileBrand);
        System.out.println("Mobile model: "+mobileModel);
        System.out.println("Mobile price: "+mobilePrice);
        System.out.println("Mobile storage: "+mobileStorage+" GB");
    }
}
public class Program1 {
    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.mobileBrand="Samsung";
        mobile.mobileModel="S26";
        mobile.mobilePrice=155000;
        mobile.mobileStorage=256;
        mobile.displayMobile();

        System.out.println();

        Mobile mobile1=new Mobile();
        mobile1.mobileStorage=128;
        mobile1.mobilePrice=56000;
        mobile1.mobileModel="13";
        mobile1.mobileBrand="Apple";
        mobile1.displayMobile();

    }
}
