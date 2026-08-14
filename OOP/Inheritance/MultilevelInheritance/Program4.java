package Basicsjava.OOP.Inheritance.MultilevelInheritance;
class Hospital{
    String hospitalName="Gavit healthcare";

}
class Doctors extends Hospital{
    String doctorName="Dr.Aditya Gavit";
    int fees=500;
}
class Patient extends Doctors{
    String patientName="Sidhi Pagar";
    double medicineBill=759.51;
    double roomCharge=1500;
    void displayBill(){
        double totalBill;
        System.out.println("----Hospital Bill-----");
        System.out.println("Hospital Name:\t "+hospitalName);
        System.out.println("Patient Name:\t "+patientName);
        System.out.println("Doctor Name patient treated:\t "+doctorName);
        System.out.println("Doctor fees:\t "+fees);
        System.out.println("Medicine Bill:\t "+medicineBill);
        System.out.println("Room charge:\t "+roomCharge);
        System.out.println("------------------");
        totalBill=fees+medicineBill+roomCharge;
        System.out.println("Total Bill:\t "+totalBill);

    }
}
public class Program4 {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.displayBill();
    }
}
