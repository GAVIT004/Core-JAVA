package Basicsjava.Oprators.LogicalOprators;
class Onlineclasses{
    void attendClass(boolean hasLaptop,boolean hasMobile){
        System.out.println("Student attend class: "+(hasLaptop||hasMobile));
    }
}
public class LogicalOprators4 {
    public static void main(String[] args){
        boolean laptop=true;
        boolean mobile=false;
        Onlineclasses onlineclasses=new Onlineclasses();
        onlineclasses.attendClass(laptop,mobile);

    }

}
