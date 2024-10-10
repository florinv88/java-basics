package org.example.example1;


import org.example.example1.A;
import org.example.example1.B;

public class App
{
    public static void main( String[] args )
    {
        A a1 = new B();
        B b1 = (B) a1;

        //In the case of hiding fields the object will refer to their own
        a1.x=10;
        b1.x="10";

        //In case of overriding both will refer to the override method
        a1.m();
        b1.m();

    }
}
