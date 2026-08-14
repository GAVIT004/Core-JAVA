package Basicsjava.Oprators;

class Studentmarks{

    void totalMarks(int m1,int m2,int m3){
        System.out.println("Total Marks: "+(m1+m2+m3));
    }

    void averageMarks(int m1,int m2,int m3){
        int averageMarks=(m1+m2+m3)/3;
        System.out.println("Average Marks: "+averageMarks);

    }


}

public class ArthmaticOprators2 {
    public static void main(String[]args){
        int marks1=80;
        int marks2=75;
        int marks3=90;
        Studentmarks std=new Studentmarks();
        std.totalMarks(marks1,marks2,marks3);
        std.averageMarks(marks1,marks2,marks3);
    }
}
