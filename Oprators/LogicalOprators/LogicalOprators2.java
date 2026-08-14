package Basicsjava.Oprators.LogicalOprators;
class Student{
    void scolarship(int marks,int attendance){
        System.out.println("Student get scolarship: "+(marks>80&&attendance>75));
    }
}
public class LogicalOprators2 {
    public static void main(String[] args){
        int marks=48;
        int attendance=64;
        Student student=new Student();
        student.scolarship(marks,attendance);

    }
}
