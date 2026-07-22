package Basicsjava.Arrays.MultiDimensionalArrays;

public class Program3 {
    public static void main(String[] args){
        int [][]arr;

        arr=new int[2][3];

        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=1;
        arr[1][1]=1;

        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[0][2]);
        System.out.println(arr[0][1]);

        System.out.println("Array size: "+arr.length);

        int [][][]numbers=new int[5][6][7];
        for (int i=0;i<2;i++){
            for (int j=0;j<6;j++){
                for (int k=0;k<7;k++){
                    System.out.print(numbers[i][j][k]+"\t");
                }
                System.out.println("\t");
            }
            System.out.println("\t");
        }

    }
}
