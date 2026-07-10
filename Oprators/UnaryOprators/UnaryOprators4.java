package Basicsjava.Oprators.UnaryOprators;

class GameScore{
    void nextLevel(int level){
        System.out.println("Next Level: "+(++level));
    }

    void preciousLevel(int level){
        System.out.println("Precious Level: "+(--level));
    }
}
public class UnaryOprators4 {
    public static void main(String[]args){
        int level=5;
        GameScore gameScore=new GameScore();
        gameScore.nextLevel(level);
        gameScore.preciousLevel(level);
    }
}
