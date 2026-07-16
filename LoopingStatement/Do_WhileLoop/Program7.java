package Basicsjava.LoopingStatement.Do_WhileLoop;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        boolean login=false;

        do{
            System.out.print(" Enter a your username: ");
            String userName=scanner.next();
            System.out.print(" Enter a your password: ");
            String password=scanner.next();

            if(userName.equals("aditya@123")&&password.equals("abc@12")){
                System.out.println("Login successfully");
                login=true;
            }else {
                System.out.println("Please enter a password again ");
            }

        }while (!login);
        scanner.close();
    }
}
