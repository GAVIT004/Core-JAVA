package Basicsjava.OOP.Inheritance.HierarchicalInheritance;

class University{
    String universityName="SPPU";
    String universityLocation="Pune";

    void displayUniversity(){
        System.out.println("University Name: "+universityName);
        System.out.println("University Location: "+universityLocation);
    }
}

class Student extends University{
    int rollNo=34;
    String studentName="Aditya Gavit";
    int mark1=84;
    int mark2=67;
    int mark3=48;
    int mark4=76;
    int mark5=94;

    void displayStudent(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Subject 1 marks: "+mark1);
        System.out.println("Subject 2 marks: "+mark2);
        System.out.println("Subject 3 marks: "+mark3);
        System.out.println("Subject 4 marks: "+mark4);
        System.out.println("Subject 5 marks: "+mark5);
    }

    int total;
    void totalMarks(){
        total=mark1+mark2+mark3+mark4+mark5;
        System.out.println("Total marks: "+total);
    }

    double percentage;
    void percentage(){
        percentage=total/5;
        System.out.println("Percentage: "+percentage);
    }

    void grade(){
        if(percentage>=90&&percentage<100){
            System.out.println("A");
        } else if (percentage>=75&&percentage<90) {
            System.out.println("B");
        } else if (percentage>=65&&percentage<75) {
            System.out.println("C");
        } else if (percentage>=55&&percentage<65) {
            System.out.println("D");
        } else if (percentage>=35&&percentage<55) {
            System.out.println("Pass");
        } else if (percentage>=0&&percentage<35) {
            System.out.println("Fail");
        }else {
            System.out.println("Error..............");
        }
    }


}

class Professor extends University{
    String professorName="Kabir Singh";
    String subject="Maths";
    int salary=120000;

    void annualSalary(){
        double annualSalary=salary*12;
        System.out.println("Annual Salary: "+annualSalary);
    }

    void displayProfesor(){
        System.out.println("Professor Name: "+professorName);
        System.out.println("Subject: "+subject);
        System.out.println("Salary: "+salary);
    }
}

class Staff extends University{
    String staffName="Ashutosh Patil";
    String  designation="Accouts";
    int salary=50000;

    void staffAnnual(){
        int annual=salary*12;
        System.out.println("Annual Salary: "+annual);
    }

    void displayStaff(){
        System.out.println("Staff Name: "+staffName);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary);
    }
}
public class Program2 {
    public static void main(String[] args){
        System.out.println("----Student----");
        Student student=new Student();
        student.displayUniversity();
        student.displayStudent();
        student.totalMarks();
        student.percentage();
        student.grade();
        System.out.println("----Professor----");
        Professor professor=new Professor();
        professor.displayUniversity();
        professor.displayProfesor();
        professor.annualSalary();
        System.out.println("----Staff----");
        Staff staff=new Staff();
        staff.displayUniversity();
        staff.displayStaff();
        staff.staffAnnual();
    }
}
