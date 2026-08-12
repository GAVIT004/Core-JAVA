package Basicsjava.PracticeProblem;

import java.util.Scanner;

class Login{
    void authenticate(String userName,String passwoord){
        if(userName.equals("gaviiiiit")&&passwoord.equals("aditya@12")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid Password!!!!");
        }
    }
}

public class Program4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a your username: ");
        String user=scanner.next();
        System.out.println("Enter a your password:");
        String pass=scanner.next();
        Login login=new Login();
        login.authenticate(user,pass);
        scanner.close();
    }
}
