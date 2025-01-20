package Interfaces;

class Calculator {
    int a, b;
    double c;

    // Default constructor with initial values
    Calculator() {
        this.a = -1;  // Set default value of a to -1
        this.b = -1;  // Set default value of b to -1
        this.c = -1.0; // Set default value of c to -1.0
    }

    // Constructor with two int parameters
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Constructor that copies values from another Calculator object
    Calculator(Calculator cal) {
        this.a = cal.a;
        this.b = cal.b;
        this.c = cal.c;
    }

    // Overloaded sum methods
    void sum(int a, int b) {
        System.out.println("Sum of two integers (void method): " + (a + b));
    }

//    int sum(int a, int b) {
//        return a + b;
//    }

    double sum(int a, double c) {
        return a + c;
    }
}


