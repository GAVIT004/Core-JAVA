package Basicsjava.OOP.Inheritance.MultilevelInheritance;

class Library{
    String libraryName="Nohara Central Library";
}

class Book extends Library{
    String title="phenoglips";
    String author="Nico Robin";
    int price=500;
}

class Member extends Book{
    String memberName="Monkey D Luffy";
    int daysLate=10;

    void calculateFine(){
        int fine=daysLate*10;
        System.out.println("Total fine: "+fine);
    }

    void displayBook(){
        System.out.println("----Fine Recipt");
        System.out.println("Library Name: "+libraryName);
        System.out.println("Book name: "+title);
        System.out.println("Book author: "+author);
        System.out.println("Book Price: "+price);
        System.out.println("Member Name: "+memberName);
        System.out.println("Days Late: "+daysLate);
    }

}
public class Program7 {
    public static void main(String[] args){
        Member member=new Member();
        member.displayBook();
        member.calculateFine();
    }
}
