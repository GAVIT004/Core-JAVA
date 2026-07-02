package Basicsjava.Oprators.AssignmentOprators;

class StudentMarks{
    void addGraceMarks(int marks){
        marks+=5;
        System.out.println("Marks: "+marks);
    }

    void findReminder(int marks){
        marks%=10;
        System.out.println("Marks: "+marks);
    }
}
public class AssignmentOprators6 {
    public static void main(String[] args){

        int marks=87;
        StudentMarks studentMarks=new StudentMarks();
        studentMarks.addGraceMarks(marks);
        studentMarks.findReminder(marks);

    }
}
