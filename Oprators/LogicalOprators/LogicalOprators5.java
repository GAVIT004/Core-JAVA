package Basicsjava.Oprators.LogicalOprators;
class Weathere{
    void goForWalk(boolean isRanning){
        System.out.println("GO for walk: "+(!isRanning));
    }
}
public class LogicalOprators5 {
    public static void main(String[] args){
        boolean rain=false;
        Weathere weathere=new Weathere();
        weathere.goForWalk(rain);


    }
}
