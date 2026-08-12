package Basicsjava.Variables.StaticVariable;

import java.util.Scanner;

class CricketPlayer{
    String playerName;
    int jerseyNumber;
    String role;
    static String teamName;
    static  int totalPlayer;

    void getCricketPlayer(String player,int jersey,String position){
        playerName=player;
        jerseyNumber=jersey;
        role=position;
    }

    static void getTeam(String team ,int total){
        teamName=team;
        totalPlayer=total;
    }

    static void displayTeam(){
        System.out.println("Team name: "+teamName);
        System.out.println("Total player: "+totalPlayer);
    }

    void displayPlayer(){
        System.out.println("Player name: "+playerName+" Jersey no: "+jerseyNumber+" Role: "+role);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String player;
        int jersey;
        String position;

        System.out.println("Enter a team name: ");
        String team=scanner.nextLine();

        System.out.println("Enter a total player: ");
        int total=scanner.nextInt();

        CricketPlayer.getTeam(team,total);

        CricketPlayer[] cricketPlayers=new CricketPlayer[total];

        for (int i=0;i<total;i++){
            scanner.nextLine();
            System.out.println("Enter a player "+(i+1)+" name: ");
            player=scanner.nextLine();
            System.out.println("Enter a player "+(i+1)+" jersey number: ");
            jersey=scanner.nextInt();
            System.out.println("Enter a player "+(i+1)+" role: ");
            position=scanner.next();
            cricketPlayers[i]=new CricketPlayer();
            cricketPlayers[i].getCricketPlayer(player,jersey,position);
        }

        CricketPlayer.displayTeam();

        for (int i=0;i<total;i++){
            cricketPlayers[i].displayPlayer();
        }

        scanner.close();

    }
}
