package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size=scanner.nextInt();
        int num[]=new int[size];
        System.out.println("Enter a numbers: ");
        for(int i=0;i<num.length;i++){
            num[i]=scanner.nextInt();
        }
        System.out.println("Your list:");
        int sum=0;
        for(int j=0;j<num.length;j++){
            System.out.println(num[j]);
            sum=sum+num[j];


        }
        double average=(double) sum/ num.length;
        System.out.println("Average: "+average);
        scanner.close();
    }
}
