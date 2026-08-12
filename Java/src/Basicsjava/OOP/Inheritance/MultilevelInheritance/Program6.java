package Basicsjava.OOP.Inheritance.MultilevelInheritance;
class User{
    String userName="Aditya Gavit";
    int mobileNumber=1234567890;
}

class Coustmor extends User{
    String address="plot no 26 hari om nagar kokani hill nandurbar 425412";
}

class PrimiumCoustmor extends Coustmor{
    String productName="Luffy Hat";
    int productPrice=499;
    int discountPercent=34;

    void calculateDiscount(){
        int discount=productPrice*discountPercent/100;
        productPrice=productPrice-discount;
        System.out.println("Discount price: "+productPrice);
    }

    void displayProduct(){
        System.out.println("----Product Bill----");
        System.out.println("User Name "+userName);
        System.out.println("User Mobile No. "+mobileNumber);
        System.out.println("Address: "+address);
        System.out.println("Product name: "+productName);
        System.out.println("Product price: "+productPrice);
        System.out.println("Product discount "+discountPercent+"%");
    }
}
public class Program6 {
    public static void main(String[]args){
        PrimiumCoustmor primiumCoustmor=new PrimiumCoustmor();
        primiumCoustmor.displayProduct();
        primiumCoustmor.calculateDiscount();
    }
}
