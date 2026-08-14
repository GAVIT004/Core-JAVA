package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size=scanner.nextInt();
        int num[]=new int[size];
        System.out.println("Enter a value of array: ");
        for(int i=0;i<num.length;i++){
            num[i]=scanner.nextInt();
        }
        for (int j=0;j< num.length;j++){
            System.out.println(num[j]);
        }
        scanner.close();
    }
}
