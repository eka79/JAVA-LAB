package bpack;
import apack.A;

public class B extends A{
    public void display() {
        System.out.println("Protected variable "+protectedvar);
        System.out.println("Public variable "+publicvar);
    }
}
