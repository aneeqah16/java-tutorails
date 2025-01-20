package polymorphism;
// poly means many and morphism means ways to represent
//so polymorphism means with many ways to represent single entity or item
// so times it might mean that a task is performed as a single action but in different ways
// types of polymorphism
// 1) compile time or static polymorphism / method overloading ==> achieved via method overloading
//  what is method overloading?
// same name of method but arguments, return types , ordering can be different
// for example multiple constructors
// java determines which constructor or the method to be called in the compile time polymorphism

//2) run time or dynamic polymorphism achieved by method overriding
// What is overriding?
// when the child class has the method same as that of the parent class just the body is different
// that is known as overriding

//
public class Circle extends Shapes{
    // this will run when the object of the circle is created
    // hence it is overriding the parent method
    @Override
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
