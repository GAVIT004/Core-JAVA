package Basicsjava.MultiThrading.Synchronizetion;

import Basicsjava.AccessModifiers.ClassLevelModifiers.Aditya;
import Basicsjava.OOP.Inheritance.HybridInheritance.Tsunami;

class Gavit{

    public synchronized void m1(){

        Tsunami tsunami = new Tsunami() {
            @Override
            public void ishandsome() {

            }
        };

        synchronized (tsunami){

            Aditya aditya=new Aditya();

            synchronized (aditya){

            }
        }
    }
}

public class Program5 {

    public static void main(String[] args) {

        Gavit gavit=new Gavit();
        gavit.m1();
    }
}
