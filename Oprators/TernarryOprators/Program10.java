package Basicsjava.Oprators.TernarryOprators;

public class Program10 {
    public static void main(String[] args){
        int marks=82;
        String result=(marks>=90)?" Grade A":(marks>=75)?" Grade B":(marks>=60)?" Grade C":" Graade D";
        System.out.println(result);
    }

}
