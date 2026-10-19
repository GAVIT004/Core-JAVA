package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

import java.util.Scanner;

class TooYoungException extends RuntimeException{

    TooYoungException(String string){
        super(string);
    }
}

class TooOldException extends RuntimeException{

    TooOldException(String message){
        super(message);
    }
}

public class CustException {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=scanner.nextInt();

        if (age>60){
            throw new TooYoungException("You are too young plz wait more");
        } else if (age<18) {
            throw new TooOldException("You are too old plz try in next life");
        }else {
            System.out.println("You will get match soon...");
        }
    }
}
