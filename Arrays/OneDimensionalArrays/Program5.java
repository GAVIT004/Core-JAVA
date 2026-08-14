package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size=scanner.nextInt();
        System.out.println("Enter numbers: ");
        int num[]=new int[size];
        for (int i=0;i< num.length;i++){
            num[i]=scanner.nextInt();
        }
        int sum=0;
        System.out.println("Your list: ");
        for(int j=0;j< num.length;j++){
            System.out.println(num[j]);
            sum=sum+num[j];

        }
        System.out.println("Sum of number : "+sum);
        scanner.close();
    }
}
