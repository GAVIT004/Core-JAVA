package Basicsjava.Oprators.LogicalOprators;
class Delivery{
    void freeDelivery(double orderAmount,boolean isPremiumMember){
        System.out.println("Free Delivery: "+(orderAmount>=500||isPremiumMember));
    }

}
public class LogicalOprators3 {
    public static void main(String[]args){
        double amount=468;
        boolean member=true;
        Delivery delivery=new Delivery();
        delivery.freeDelivery(amount,member);

    }
}
