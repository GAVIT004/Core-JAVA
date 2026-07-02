package Basicsjava.Oprators.AssignmentOprators;

class ProductStock{
    void addStock(int stock){
        stock+=20;
        System.out.println("Stock: "+stock);
    }

    void sellStock(int stock){
        stock-=15;
        System.out.println("Stock: "+stock);
    }
}
public class AssignmentOprators4 {
    public static void main(String[]args){
        int initialStock=100;
        ProductStock productStock=new ProductStock();
        productStock.addStock(initialStock);
        productStock.sellStock(initialStock);
    }
}
