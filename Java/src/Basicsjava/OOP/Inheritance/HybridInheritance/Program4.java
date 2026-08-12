package Basicsjava.OOP.Inheritance.HybridInheritance;

interface Aditya{
    abstract void ishandsome();
}
interface  Tsunami{
    abstract  void ishandsome();
}
public class Program4 implements Aditya,Tsunami {

    public void ishandsome(){
        System.out.println("Aditya is handsome");
    }

    public static void main(String[] args) {
        Program4 program4=new Program4();
        program4.ishandsome();
    }
}
