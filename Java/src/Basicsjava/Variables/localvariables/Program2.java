package Basicsjava.Variables.localvariables;

//This example demonstrates that local variables are only accessible within the block in which they are declared

public class Program2 {
    public static void main(String[] args) {
        int x=10;
        String message="Hello world!";
        System.out.println("X= "+x);
        System.out.println("Message "+message);
        if (x>5){
            String result="X is grater than 5";
            System.out.println(result);
        }
        for (int i=0;i<3;i++){
            String loopMessage="Iteration"+i;
            System.out.println(loopMessage);
        }
    }
}
