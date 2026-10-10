package Basicsjava.OOP.Inheritance.IsARelationship;

class Parent1{

    public void method1(){
        System.out.println("Parent1");
    }
}

class Child1 extends Parent1{

    public void method2(){
        System.out.println("Child1");
    }
}

public class Program1 {

    public static void main(String[] args) {

        Parent1 parent1=new Parent1();
        parent1.method1();
        //parent1.method2();  Cannot resolve method 'method2' in 'Parent1'

        Child1 child1=new Child1();
        child1.method1();
        child1.method2();

        Parent1 parent2=new Child1();
        parent2.method1();
       // parent2.method2();  Cannot resolve method 'method2' in 'Parent1'

       // Child1 child2=new Parent1(); CE: incompatible type found: Parent required: Child1
    }
}
