package Basicsjava.Oprators.UnaryOprators;

class UnaryOperations {

    void preIncrement(int num) {
        System.out.println("Pre Increment: " + (++num));
    }

    void postIncrement(int num) {
        System.out.println("Post Increment: " + (num++));
        System.out.println("After Post Increment: " + num);
    }

    void preDecrement(int num) {
        System.out.println("Pre Decrement: " + (--num));
    }

    void postDecrement(int num) {
        System.out.println("Post Decrement: " + (num--));
        System.out.println("After Post Decrement: " + num);
    }

    void unaryMinus(int num) {
        System.out.println("Unary Minus: " + (-num));
    }

    void logicalNot(boolean value) {
        System.out.println("Logical NOT: " + (!value));
    }
}

public class UnaryOprators {
    public static void main(String[] args) {

        UnaryOperations op = new UnaryOperations();

        int number = 10;
        boolean flag = true;

        op.preIncrement(number);
        op.postIncrement(number);
        op.preDecrement(number);
        op.postDecrement(number);
        op.unaryMinus(number);
        op.logicalNot(flag);
    }
}