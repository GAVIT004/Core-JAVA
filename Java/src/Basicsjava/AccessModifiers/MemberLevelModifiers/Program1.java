package Basicsjava.AccessModifiers.MemberLevelModifiers;

import Basicsjava.AccessModifiers.MemberLevelModifiers.Pack2.Program2;
import Basicsjava.AccessModifiers.MemberLevelModifiers.Pack2.Program3;

/*class Program1 {

     public static void main(String[] args) {

         Program2 program2=new Program2();
         program2.method1();

         'Basicsjava.AccessModifiers.MemberLevelModifiers.Pack2.Program2' is not public in 'Basicsjava.AccessModifiers.MemberLevelModifiers.Pack2'.
                 Cannot be accessed from outside package
     }
}*/

/*class Program1{

    public static void main(String[] args) {

        Program2 program2=new Program2();
        program2.method1();

        'method1()' is not public in 'Basicsjava.AccessModifiers.MemberLevelModifiers.Pack2.Program2'. Cannot be accessed from outside package
    }
}*/

class Program1{

    public static void main(String[] args) {

        Program2 program2=new Program2();
        program2.method1();
    }
}

class ProtectedAccessing extends Program3 {

    public static void main(String[] args) {

        ProtectedAccessing protectedAccessing=new ProtectedAccessing();
        protectedAccessing.method1();

    }
}