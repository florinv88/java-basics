package org.example.classes;

public class B extends A { //B it's a "A" type
    /**
     * when an object B it's created before doing anything the constructor of the superclass will be called
     * default knows only how to call the default constructor from the superclass
     * -we can call a specific constructor using super keyword : super() and the signature of the constructor needed
     * -to call the specific constructor from the current class we can use this()
     */


    /**
     * this  --> used to refer the instance of the same class
     * this() --> used to call a specific constructor of the class
     * super --> used tot refer the instance that has been created
     * super() --> used to call a specific constructor of the superclass
     */
    public B () {
        super(10);
        System.out.println("Calling B..");
    }

    public B (int x) {
        this();
        System.out.println(super.x);
        System.out.println("Calling B after default contructor..");

    }
}
