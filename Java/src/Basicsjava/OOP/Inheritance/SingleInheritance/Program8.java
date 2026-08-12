package Basicsjava.OOP.Inheritance.SingleInheritance;
class Hospital{
    void admit(){
        System.out.println("Patient is admit");
    }
}
class Doctor extends Hospital{
    void treat(){
        System.out.println("Doctor is treating a patient");
    }
}
public class Program8 {
    public static void main(String[] args){
        Doctor doctor=new Doctor();
        doctor.admit();
        doctor.treat();


    }
}
