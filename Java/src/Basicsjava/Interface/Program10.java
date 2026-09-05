package Basicsjava.Interface;

interface AdapterX{

    public abstract void m1();
    public abstract void m2();
    public abstract void m3();
    public abstract void mn();
}

abstract class Adapter implements AdapterX{

    @Override
    public void m1() {
        System.out.println("Adapter m1");
    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void mn() {

    }
}

public class Program10 extends Adapter{

    @Override
    public void m3() {
        System.out.println("Adapter m3");
    }
}
