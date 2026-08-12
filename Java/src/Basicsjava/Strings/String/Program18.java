package Basicsjava.Strings.String;

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a userName: ");
        String userName=scanner.nextLine();

        if(isValid(userName)){
            System.out.println("Valid userName ");
        }else {
            System.out.println("Invalid userName");
        }

        scanner.close();
    }

    public static boolean isValid(String userName){
        if (userName.length()>15||userName.length()<5){
            return false;
        }

        if(!Character.isLetter(userName.charAt(0))){
            return false;
        }

        for (int i=0;i<userName.length();i++){
            char chars=userName.charAt(i);

            boolean isLetter=Character.isLetter(chars);
            boolean isDigit=Character.isDigit(chars);
            boolean isUnderScore=(chars=='_');

            if(!isLetter&&!isDigit&&!isUnderScore){
                return false;
            }
        }
        return true;
    }

}
