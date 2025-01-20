package polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();




//        shape.area();
//        circle.area();
//        square.area();
        // polymorphism: act of representing a same thing in multiple ways
//        Shapes square1 = new Square();
//        square1.area();

        // if the type of the reference variable is the parent class
        // but the object  is of the type of the subclass

        Shapes obj = new Circle();

        // parent obj = new child());
        // here, which method will be called depends on the child
        // this is known as upcasting
        // and this entire thing is known as dynamic memory dispatch
        // or how overriding works
        // Question:
        // How does java determine this?
        // java does this by the method called as dynamic memory dispatch
        // it is just a mechanism by which the call to an overridden method
        // is resolved at runtime rather than compile time or we can say
        // when the program is running, at that time it will determine which method to run
        //


        // in other word its the type of the object being referred to
        // and not the type of the reference variable that determines which
//        version of the overridden method will be executed


//        you can also use final keyword to prevent inheritance
        // whenever you declare the any method as final, it will implicitly declare its methods final too



        // you cannot override the method if its final
        // why? because the method that are declared as final are somehow considered as the performance enhancement
        //because the compiler is free to inline the calls to them because the compiler
        //will know that these method will not be overridden and as the overriding and the stuff happens at the runtime
        // so when the final method is called java compiler can copy the
        // byte code from the sub routine or whatever the internal implementation is
        // directly with the compile code of the calling method hence
        //eliminating the overhead associated with this method called like which one to
        // actually to resolve



        // The dynamic method resolution because it's happening at the runtime after the compilation, byte code stuff
        // and everything is done , when the program is running , that is when
        // overriding determines which when to run hence its also known as late binding
        // however since the final method cannot be overridden,
        // a call to one can be resolved at compile time only this is called early binding

        //
        //
        //
        




    }
}
