package Basicsjava.OOP.Inheritance.SingleInheritance;
class Mobile{
    void call(){
        System.out.println("Calling......");
    }
}
class SmartPhone extends Mobile{
    void browseInternet(){
        System.out.println("Browsing a internet");
    }
}
public class Program6 {
    public static void main(String[] args){
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.call();
        smartPhone.browseInternet();

    }
}
