package Basicsjava.Oprators.AssignmentOprators;

class Rectangle{
    void doubleLength(int len){
        len*=2;
        System.out.println("Length: "+len);
    }

    void halfLegth(int len){
        len/=2;
        System.out.println("Length: "+len);
    }
}

public class AssignmentOprators5 {
    public static void main(String[] args){
        int length=20;
        Rectangle rectangle=new Rectangle();
        rectangle.doubleLength(length);
        rectangle.halfLegth(length);

    }
}
