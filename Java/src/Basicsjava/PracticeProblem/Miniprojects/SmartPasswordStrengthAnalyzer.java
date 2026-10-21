package Basicsjava.PracticeProblem.Miniprojects;

import java.util.Scanner;

class Password{

    public boolean hasUppercase(String password){
        for (int i=0;i<password.length();i++){
            if(Character.isUpperCase(password.charAt(i)))
                return true;
        }
        return false;
    }

    public boolean hasLowercase(String password){
        for (int i=0;i<password.length();i++){
            if (Character.isLowerCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean hasNumbers(String password){
        for (int i=0;i<password.length();i++){
            if (Character.isDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean hasSpecialCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasNoSpaces(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i)==' ') {
                return false;
            }
        }
        return true;
    }

}

public class SmartPasswordStrengthAnalyzer {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Password password1=new Password();

        System.out.println("Enter a Password: ");
        String password=scanner.nextLine();

        if (password.length()<8){
            System.out.println("Password is too short");
            scanner.close();
            return;
        }

        if (!password1.hasNoSpaces(password)) {
            System.out.println("Password must not contain spaces!");
            scanner.close();
            return;
        }

        int categoryCount=0;

        if (password1.hasUppercase(password)){
            categoryCount++;
        }

        if (password1.hasLowercase(password)){
            categoryCount++;
        }

        if (password1.hasSpecialCharacters(password)){
            categoryCount++;
        }

        if (password1.hasNumbers(password)){
            categoryCount++;
        }

        System.out.println("Category Count: "+categoryCount);
        System.out.println("Password length: "+password.length());


        switch (categoryCount){
            case 0:
                System.out.println("Weakest Password");
                break;
            case 1:
                System.out.println("Weak Password");
                break;
            case 2:
                System.out.println("Medium Password");
                break;
            case 3:
                System.out.println("Strong Password");
                break;
            case 4:
                System.out.println("Strongest Password");
                break;
            default:
                System.out.println("Invalid Category");
        }

        scanner.close();
    }
}
