package Basicsjava.Arrays.OneDimensionalArrays;

public class Program1 {
    public static void main(String[] args){
        int[] marks=new int[3];
        marks[0]=54;
        marks[1]=31;
        marks[2]=87;

        //marks[3]=45;//array index out of bound

        System.out.println(marks.length);//it gives lenth of array

        System.out.println(marks);// it giver garbage values
        System.out.println(marks[0]);// it gives 0 index value
        System.out.println(marks[1]);// it gives 1 index value
        System.out.println(marks[2]);// it gives 2 index value

    }
}
