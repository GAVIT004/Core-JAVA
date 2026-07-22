package Basicsjava.Arrays.MultiDimensionalArrays;

public class Program5 {
    public static void main(String[] args){
        int rows=2;
        int columns=3;

        int arr[][]=new int[rows][columns];

        int it=1;

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                arr[i][j]=it;
            }
        }

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
