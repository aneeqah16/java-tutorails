public class OOPSwithJava {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

//       store 5 names
//       data of 5 students
        int[] rno = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];
//        A class is a named group of properties and functions
        Student[] students = new Student[5];


//        Student aneeqah; //  just declaring
//        aneeqah = new Student();
        Student aneeqah = new Student();
        // dynamically allocates the memory and returns a reference variable to it
        aneeqah.name = "Aneeqah";

        aneeqah.marks = 100;
        aneeqah.rno = 34;

        System.out.println(aneeqah.name);
        System.out.println(aneeqah.marks);
        System.out.println(aneeqah.rno);

    }
// syntax for creating a class
//    class is like a logical construct
//    a class is a template for creating objects and
//    and an object is a physical reality
//    this is the thing that takes up / occpies space in the memory

}
     class Student {
        String name;
        float marks;
        int rno = 16;
}




