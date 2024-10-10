package org.example1;

public interface Playable { //abstract

    //Until java 7 the only things that we were able to do with interfaces
    //- abstract methods by default & public modifier
    //- static fields (public static final)
    //!!The most used scenarios

    int x=1;

    void play();

    //Since java 8 now we can have also method with declaration inside of an interface
    //-it's clean code ?
    //- Chat gpt says that it is in a few cases :
    /*
     * -Backward Compatibility:
     * If you're working with an interface that has many implementing classes, and you want to add a new method without breaking those classes, default methods provide a clean solution.
     * Implementing classes can either override the default behavior or use it as-is.
     * -Shared Behavior:
     * If multiple classes are going to share the same basic behavior, and you want to avoid duplication across them, a default method can be useful.
     * -Simplicity: When the default behavior is simple and logical, it can make the code cleaner by reducing boilerplate in implementing classes.
     * It keeps the focus on the unique aspects of each class, as they don’t have to implement routine behavior.
     */

    default void lol(){   //public
        System.out.println("LOL");
    }

   private static void hmm(){ // the static methods can be also private
        System.out.println("hmm");
    }

}
