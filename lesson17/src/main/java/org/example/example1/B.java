package org.example.example1;

public class B extends A { //B it's a "A" type
    public String x; //hidding fields
    public int y;

    @Override
    public void m() {
        System.out.println("The method from B");
    }
}
