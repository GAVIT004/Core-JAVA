package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size=scanner.nextInt();
        System.out.println("Enter a number: ");
        int []num=new int[size];
        for(int i=0;i<num.length;i++){
            num[i]=scanner.nextInt();
        }
        System.out.println("Your list: ");
        int maxNUm=num[0];
        for(int j=0;j<num.length;j++){
            System.out.println(num[j]);

            if(maxNUm<num[j]){
                maxNUm=num[j];
            }

        }
        System.out.println("maz number: "+maxNUm);
        scanner.close();
    }
}
