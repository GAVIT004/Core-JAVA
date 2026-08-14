package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=scanner.nextInt();
        System.out.println("Enter a array: ");
        int[]numu=new int[size];
        for(int i=0;i<numu.length;i++) {
            numu[i] = scanner.nextInt();
        }
        System.out.println("your list: ");
        int minNum=numu[0];
        for(int j=0;j<numu.length;j++){
            System.out.println(numu[j]);
            if(numu[j]<minNum){
                minNum=numu[j];
            }

        }
        System.out.println("Smallest number: "+minNum);
        scanner.close();
    }
}
