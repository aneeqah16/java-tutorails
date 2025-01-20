package AccesssModifier;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    // such properties that are not directly linked to the object
    // those are known as static variables
    static void message(){
        System.out.println("Human name ");

    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

//        whenever a new human is being created then the population is equal to population = population +1
//        in order to access the static variable we use the class name => Human
        // note : whenever you are accessing static variable,
        // modifying static variable, dont do it via the reference variable
        // it will work but the convention is to use it via the class name



        // static : when a member is declared static,it can be accessed  before any of the object
        // of the class is being created and without referencing to that object.
        // 2) you can declare both methods and variables as static

        // why is main declared as static?
//        main is declared as static because we can use the main method
//        without creating the object of that class
        // static method can access only the static data
        // it cannot access the non static data because a non static actually belongs to an instance
        // we know that something that is not static belongs to an object
    }
}
