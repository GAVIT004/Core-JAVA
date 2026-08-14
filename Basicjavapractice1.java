package Basicsjava;

import java.util.Scanner;

public class Basicjavapractice1 {
    public static void main(String[]args){
        System.out.println("Hello world welcome to java programs");


        int a=10;
        int b=20;
        int sum = a+b;
        System.out.println("Sum of a and b is:"+sum);


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.nextLine();
        System.out.println("Hello i am" +  name);

        System.out.println("Enter number to find out number is even or odd");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+ "This num  is even");
        }else {
            System.out.println(num+"This num is odd");
        }

        System.out.println("Enter number for findout largest number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("Num1 is largest");
        }else{
            System.out.println("Num2 is largest");
        }

        System.out.println("Enter number for table multiplication");
        int num3= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num3+"X"+ i +"="+(num3*i));

        }

        System.out.println("Enter a number sum n number:" );
        int num4= sc.nextInt();
        int sumOfNum4=0;
        for(int i=1;i<=num4;i++){
            sumOfNum4+=i;
            System.out.println("Sum="+sumOfNum4);
        }

        System.out.println("Enter a number to find out factorial");
        int num5= sc.nextInt();
        long factorial=1;
        for(int i=1;i<=num5;i++){
            factorial*=i;
            System.out.println("Factorial of number:"+num5+"="+factorial);

        }

        System.out.println("Enter number for reverse");
        int num6= sc.nextInt();
        int reverse=0;
        while (num6!=0){
            int digit=num6%10;
            reverse = reverse*10+digit;
            num6/=10;
        }
        System.out.println(reverse);

        System.out.println("Enter a number to find out a prime number");
        int num7= sc.nextInt();
        boolean prime=true;
        for(int i=2;i<num7;i++) {
            if (num7 % i == 0) {
                prime=false;
                break;

            }
        }
        if(prime){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }







    }
}
