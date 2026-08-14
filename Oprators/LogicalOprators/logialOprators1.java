package Basicsjava.Oprators.LogicalOprators;
class Voter{
    void canVote(int age,boolean hasVoterId){
        System.out.println("Person con vote "+(age>=18&&hasVoterId));
    }
}
public class logialOprators1 {
    public static void main(String[] args){
        int age=19;
        boolean voterId=false;
        Voter voter=new Voter();
        voter.canVote(age,voterId);

    }

}
