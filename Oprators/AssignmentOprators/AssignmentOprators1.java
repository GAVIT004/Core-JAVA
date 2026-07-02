package Basicsjava.Oprators.AssignmentOprators;

class AssignmentOperations {

    void assign(int num) {
        int value = num;
        System.out.println("Assignment (=): " + value);
    }

    void addAssign(int num) {
        num += 5;
        System.out.println("Addition Assignment (+=): " + num);
    }

    void subtractAssign(int num) {
        num -= 5;
        System.out.println("Subtraction Assignment (-=): " + num);
    }

    void multiplyAssign(int num) {
        num *= 5;
        System.out.println("Multiplication Assignment (*=): " + num);
    }

    void divideAssign(int num) {
        num /= 5;
        System.out.println("Division Assignment (/=): " + num);
    }

    void modulusAssign(int num) {
        num %= 5;
        System.out.println("Modulus Assignment (%=): " + num);
    }
}

public class AssignmentOprators1 {
    public static void main(String[] args) {

        int num = 20;

        AssignmentOperations op = new AssignmentOperations();

        op.assign(num);
        op.addAssign(num);
        op.subtractAssign(num);
        op.multiplyAssign(num);
        op.divideAssign(num);
        op.modulusAssign(num);
    }
}