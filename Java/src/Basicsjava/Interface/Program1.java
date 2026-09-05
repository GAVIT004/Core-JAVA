package Basicsjava.Interface;

interface inter{

    void m1();
    void m2();
}

abstract class ServiceProvider implements inter{

    @Override
    public void m1() {

    }
}

public class Program1 extends ServiceProvider{

    @Override
    public void m2() {

    }
}
