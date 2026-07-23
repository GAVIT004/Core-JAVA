package Basicsjava.Arrays.JaggedArray;

public class Program1 {
    public static void main(String[] args) {
        int rows = 5;

        int arr[][] = new int[rows][];

        for (int i=0;i< arr.length;i++){
            arr[i]=new int[i+1];
        }
        int count=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
            }
        }
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
