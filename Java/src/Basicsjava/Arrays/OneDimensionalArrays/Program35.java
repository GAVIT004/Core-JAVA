package Basicsjava.Arrays.OneDimensionalArrays;

public class Program35 {

    public static void main(String[] args) {

        int arr[]={2,-1,3,5,-6};

        for (int i=0;i<arr.length;i++){

            if(arr[i]>0){
                arr[i]=arr[i];
                System.out.println(arr[i]);
            } else if (arr[i]<0) {
                arr[i]=arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
