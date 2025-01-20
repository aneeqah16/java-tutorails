package Interfaces;

public class Main {
    public static void main(String[] args) {
        // Create a single Calculator object with default constructor
        Calculator obj1 = new Calculator(); // This will call the default constructor

        // Accessing all three overloaded methods using obj1
        obj1.sum(4, 6);           // Calls the void sum(int a, int b)
//        int result1 = obj1.sum(10, 15); // Calls the int sum(int a, int b)
        double result2 = obj1.sum(7, 2.5); // Calls the double sum(int a, double c)

        // Printing results
        System.out.println("Result of int sum: " + result1);
        System.out.println("Result of double sum: " + result2);

        // Using the copy constructor to create a new object from obj1
        Calculator obj2 = new Calculator(obj1); // Calls the copy constructor
        System.out.println("Copy constructor called. obj2: a = " + obj2.a + ", b = " + obj2.b + ", c = " + obj2.c);
    }
}
