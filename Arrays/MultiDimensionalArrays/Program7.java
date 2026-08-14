package Basicsjava.Arrays.MultiDimensionalArrays;

//Java program to show how to create and print 3D array.

public class Program7 {
    public static void main(String[] args) {
        int arr[][][]={
                {{1,2},{3,4}},
                {{5,6},{7,8}}
        };

        int m=arr.length;
        int n=arr[0].length;
        int o=arr[0][0].length;

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                for (int k=0;k<o;k++){
                    System.out.print("arr["+i+"]["+j+"]["+k+"]="+arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
