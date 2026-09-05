package Basicsjava.Interface;

interface Left1{

    public abstract void m1();
}

interface Right1{

    public abstract void m1(int x);
}
public class Program6 implements Left1,Right1{

    @Override
    public void m1() {

    }

    @Override
    public void m1(int x) {

    }
}
