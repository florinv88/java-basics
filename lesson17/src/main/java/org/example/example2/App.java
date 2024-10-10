package org.example.example2;

public class App {

    public static void main(String[] args) {

        Animal a1 = new Cat();
        Animal a2 = new Dog();

        Cat c1 = (Cat) a1;
        Cat c2 = (Cat) a2; //ClassCastException
    }
}
