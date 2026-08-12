package Basicsjava.OOP.Inheritance.HierarchicalInheritance;

import java.util.Scanner;

class Hospital{
    String hospitalName;
    String hospitalAddress;

    void getHospital(String name,String address){
        hospitalName=name;
        hospitalAddress=address;
    }

    void displayHospital(){
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Hospital Address: "+hospitalAddress);
    }
}

class Doctor extends Hospital{
    String doctorName;
    String specialization;
    int consulationFees;
    int patientPerDay;

    void getDoctor(String name,String special,int fees,int patient,int days){
        doctorName=name;
        specialization=special;
        consulationFees=fees;
        patientPerDay=patient;
        doctorWorkDays=days;
    }

    void displayDoctor(){
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Doctor specialization: "+specialization);
        System.out.println("Doctor consulation fees: "+consulationFees);
        System.out.println("Patient per day: "+patientPerDay);
    }

    double dailyIncome;
    void dailyIncome(){
        dailyIncome=consulationFees*patientPerDay;
        System.out.println("Doctor daily income: "+dailyIncome);
    }

    int doctorWorkDays;
    void monthlyIncome(){
        double monthlyIncome=dailyIncome*doctorWorkDays;
        System.out.println("Doctor monthly income: "+monthlyIncome);
    }
}

class Nurse extends Hospital{
    String nurseName;
    int shifts;
    double salary;

    void getNurse(String name,int shift,double sal){
        nurseName=name;
        shifts=shift;
        salary=sal;
    }

    void displayNurse(){
        System.out.println("Nurse Name: "+nurseName);
        System.out.println("Total shifts in year: "+shifts);
        System.out.println("Salary per shift: "+salary);
    }

    void annualSalary(){
        double annualSalary=shifts*salary;
        System.out.println("Nurse annual salary: "+annualSalary);
    }
}

class Patient extends Hospital{
    String patientName;
    double roomCharge;
    double medicineBill;
    double testCharge;

    void getPatient(String name,double room,double medicine,double test){
        patientName=name;
        roomCharge=room;
        medicineBill=medicine;
        testCharge=test;
    }

    void displayPatient(){
        System.out.println("Patient Name: "+patientName);
        System.out.println("Room charges: "+roomCharge);
        System.out.println("Medicine Bill: "+medicineBill);
        System.out.println("Test charges: "+testCharge);
    }

    double totalBill;
    void totalBill(){
        totalBill=roomCharge+medicineBill+testCharge;
        System.out.println("Total Bill: "+totalBill);
    }

    double gst;
    void gst(){
        gst=(totalBill*18)/100;
        System.out.println("GST(18%): "+gst);
    }

    void finalBill(){
        double finalBill=totalBill+gst;
        System.out.println("Final Bill: "+finalBill);
    }
}

public class Program5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("***Feel Hospital Detail***");
        System.out.print("Enter a hospital name: ");
        String name=scanner.nextLine();
        System.out.print("Enter hospital address: ");
        String address=scanner.nextLine();

        System.out.println("***Feel Doctor Detail***");
        System.out.print("Enter Doctor Name: ");
        String docName=scanner.nextLine();
        System.out.print("Enter a Doctor speciallization: ");
        String spcial=scanner.next();
        System.out.print("Enter doctor consulation fees: ");
        int fees=scanner.nextInt();
        System.out.print("Enter patient per day count: ");
        int patient=scanner.nextInt();
        System.out.println();
        System.out.print("Enter doctor working days monthly: ");
        int days=scanner.nextInt();
        scanner.nextLine();

        System.out.println("***Feel Nurse Detail***");
        System.out.print("Enter a nurse name:");
        String nurName=scanner.nextLine();
        System.out.print("Enter total nurse shifts in year: ");
        int shift=scanner.nextInt();
        System.out.print("Enter a nurse per shift salary: ");
        double sal=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("***Feel Patient Detail***");
        System.out.print("Enter patient name: ");
        String patiName=scanner.nextLine();
        System.out.print("Enter a room charge: ");
        double room=scanner.nextDouble();
        System.out.print("Enter patient medicine bill: ");
        double medicine=scanner.nextDouble();
        System.out.print("Enter a patient test charges: ");
        double test=scanner.nextDouble();

        System.out.println("----Doctor Report----");
        Doctor doctor=new Doctor();
        doctor.getHospital(name,address);
        doctor.getDoctor(docName,spcial,fees,patient,days);
        doctor.displayHospital();
        doctor.displayDoctor();
        doctor.dailyIncome();
        doctor.monthlyIncome();

        System.out.println("----Nurse Report----");
        Nurse nurse=new Nurse();
        nurse.getHospital(name,address);
        nurse.getNurse(nurName,shift,sal);
        nurse.displayHospital();
        nurse.displayNurse();
        nurse.annualSalary();

        System.out.print("----Patient Report----");
        Patient patient1=new Patient();
        patient1.getHospital(name,address);
        patient1.getPatient(patiName,room,medicine,test);
        patient1.displayHospital();
        patient1.displayPatient();
        patient1.totalBill();
        patient1.gst();
        patient1.finalBill();

        scanner.close();
    }
}
