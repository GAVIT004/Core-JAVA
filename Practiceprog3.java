package Basicsjava;

import java.util.Scanner;

class LibraryManagement{
    String bookName;
    String bookAuther;
    int bookprice;

    LibraryManagement(String bName,String bAuther,int bPrice){
        bookName=bName;
        bookAuther=bAuther;
        bookprice=bPrice;
    }

    void displayBook(){
        System.out.println("Book Name: "+bookName);
        System.out.println("Book Auther: "+bookAuther);
        System.out.println("Book Price: "+bookprice);

    }
}

public class Practiceprog3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Who many books??");
        int noBook=sc.nextInt();
        LibraryManagement[] lab=new LibraryManagement[noBook];
        for(int i=0;i<noBook;i++){
            System.out.println("Enter Book detail:"+(i+1));
            System.out.println("Enter a Book Name: ");
            String bName=sc.next();
            System.out.println("Enter a Book Auther Name: ");
            String bAuther= sc.next();
            System.out.println("Enter a Book Name: ");
            int bPrice=sc.nextInt();

            lab[i]=new LibraryManagement(bName,bAuther,bPrice);


        }

        System.out.println("Book Details");
        for(int i=0;i<noBook;i++){
            lab[i].displayBook();

        }
        sc.close();

    }
}
