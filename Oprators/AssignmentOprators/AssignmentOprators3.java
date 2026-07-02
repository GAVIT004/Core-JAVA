package Basicsjava.Oprators.AssignmentOprators;

class Salary{
    void bonus(int salary){
        salary+=2000;
        System.out.println("Salary with bonus: "+salary);

    }

    void tax(int salary){
        salary -=1000;
        System.out.println("Salary after tax: "+salary);
    }
}
public class AssignmentOprators3 {
    public static void main(String[]args){
        int initialSalary=25000;
        Salary salary=new Salary();
        salary.bonus(initialSalary);
        salary.tax(initialSalary);
    }
}
