package Basicsjava.Oprators.UnaryOprators;

class LightSwitch{
    void toggle(boolean isOn){
        System.out.println("Light Switch: "+(!isOn));
    }
}
public class UnaryOprators3 {
    public static void main(String[]args){
        boolean isOn=true;
        LightSwitch lightSwitch=new LightSwitch();
        lightSwitch.toggle(isOn);


    }
}
