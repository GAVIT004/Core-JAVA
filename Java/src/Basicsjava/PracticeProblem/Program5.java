package Basicsjava.PracticeProblem;

import java.util.Scanner;

class Patient{
    String patientName;
    int patientAge;
    String patientGender;
    String patientDisease;
    double patientTemperature;

    void getPatient(String name,int age,String gender,String disease,double temperature){
        patientName=name;
        patientAge=age;
        patientGender=gender;
        patientDisease=disease;
        patientTemperature=temperature;
    }

    void displayPatient(){
        System.out.println("Patient name: "+patientName);
        System.out.println("Patient age: "+patientAge);
        System.out.println("Patient gender: "+patientGender);
        System.out.println("Patient disease: "+patientDisease);
        System.out.println("Patient temperature: "+patientTemperature);
    }

    void checkPriority(){
        if(patientTemperature>=102){
            System.out.println("Emergency");
        } else if (patientAge>=60) {
            System.out.println("High Priority");
        }else {
            System.out.println("Normal");
        }
    }


}
public class Program5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        Patient patient[]=new Patient[5];

        for (int i=0;i<patient.length;i++){
            System.out.println("Enter a patient detail "+(i+1));
            System.out.print("Enter a patient name: ");
            String name=scanner.nextLine();
            System.out.print("Enter a patient age: ");
            int age=scanner.nextInt();
            System.out.print("Enter a patient gender: ");
            String gender=scanner.next();
            scanner.nextLine();
            System.out.print("Enter a patient disease: ");
            String disease=scanner.nextLine();
            System.out.print("Enter a patient temperature: ");
            double temperature=scanner.nextDouble();
            scanner.nextLine();
            patient[i]=new Patient();
            patient[i].getPatient(name,age,gender,disease,temperature);
        }

        System.out.println("#### Patient Details ####");
        for (int i=0;i<patient.length;i++){
            patient[i].displayPatient();
            patient[i].checkPriority();
        }
        scanner.close();;
    }
}
