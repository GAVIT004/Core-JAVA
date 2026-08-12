package Basicsjava.OOP.Inheritance.MultipleInheritance;

interface Camera{
    default void takePhoto(){
        System.out.println("Photo taken");
    }
}

interface MusicPlayer{
    default void playMusic(){
        System.out.println("Music playing...");
    }
}

class Smartphone implements Camera,MusicPlayer{
    void deviceInfo(){
        Camera.super.takePhoto();
        MusicPlayer.super.playMusic();
        System.out.println("Smartphone Information");
    }
}
public class Program1 {
    public static void main(String[] args){
        Smartphone smarphone=new Smartphone();
        smarphone.deviceInfo();
    }
}
