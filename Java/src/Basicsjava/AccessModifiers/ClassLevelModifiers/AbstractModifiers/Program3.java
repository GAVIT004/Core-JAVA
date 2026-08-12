package Basicsjava.AccessModifiers.ClassLevelModifiers.AbstractModifiers;

public class Program3 {

   // abstract final void method1(); //Illegal combination of modifiers 'abstract' and 'final'

   // abstract native void method1();  //Illegal combination of modifiers 'abstract' and 'native'

   // abstract synchronized void method1();   //Illegal combination of modifiers 'synchronized' and 'abstract'

//    abstract static void method1();     Illegal combination of modifiers 'abstract' and 'static'

//    abstract private void method1();    Illegal combination of modifiers 'abstract' and 'private'

//    abstract strictfp void method1();    Illegal combination of modifiers 'strictfp' and 'abstract'


    public static void main(String[] args) {

        System.out.println("Illegal combinations");
    }
}
