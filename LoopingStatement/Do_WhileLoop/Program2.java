package Basicsjava.LoopingStatement.Do_WhileLoop;

public class Program2 {
    public static void main(String[] args){
        int num=1;
        do{
            if(num%2==0){
                System.out.print(num+",");
            }
            num++;

        }while (num<=20);
    }
}
