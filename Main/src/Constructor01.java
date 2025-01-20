public class Constructor01 {
    // constructor is a function that runs when you create an object and it allocates some variable

    static class Student {
        String name;
        int rno;
        float marks;
        // default or non parameterized constructor

        // paramertized constructor
        Student(String n,int roll, float m){
            this.name = n;
            this.rno = roll;
            this.marks = m;
        }

        // copy constructor
        // here the student takes value form another type of student

        Student( Student other){
            this.name = other.name;
            // current name = previous students name
            this.rno = other.rno;
            this.marks = other.marks;

        }
        // call constructor from another constructor as well
        Student() {
            // we need a way to add the values the above
            // properties object by object

            // we need a one word to access every object
            // and that one keyword is this
//            this.name = "Aneeqah";
//            this.rno = 16;
//            this.marks = 90f;
            // call constructor from another constructor as well
//            this  is how you call a constructor form another constructor
            this("default person",12,100f);
            // internally its something like
            // new Student("default person",12,100f);
        }
        void greeting(){
            System.out.println("Hello, " + name + "!");
        }
        void changeName(String newName){
            this.name = newName;
        }

    }


    public static void main(String[] args) {
        Student[] students = new Student[2];

        // creating objects
        Student aneeqah = new Student("Aneeqah",34,98f);
        students[0] = aneeqah;
        Student eman = new Student();
        students[1] = eman;
        System.out.println(aneeqah.name);
        System.out.println(aneeqah.rno);
        System.out.println(aneeqah.marks);
//        System.out.println(aneeqah.greeting());
        aneeqah.greeting();
        System.out.println(eman.name);
        System.out.println(eman.rno);
        System.out.println(eman.marks);
        eman.changeName("Eman");
        eman.greeting();
        System.out.println(students[0].name);
        System.out.println(students[1].name);

        // let's make another object of data type student
        // paramertized constructor
        Student irtiza = new Student("Irtiza",21,78f);
        System.out.println(irtiza.name);
        System.out.println(irtiza.rno);
        System.out.println(irtiza.marks);
        // copy constructor usage
        Student random = new Student(eman);
        // here this will replace random and other will replace eman
        System.out.println(random.name);
        System.out.println(random.rno);
        System.out.println(random.marks);

        // creating other object
        Student random2 = new Student();
        System.out.println(random2.name);
        System.out.println(random2.rno);
        System.out.println(random2.marks);
//   Why we don't use new keyword with primitive data types
//        because they are not treated as objects in java

        Student one = new Student();
        Student two =one;
        // here both reference variables are pointing to
        // the same object so you make a change via one,the same changes will be reflected in the two object
        one.name ="shaista";

        System.out.println(two.name);


    }

}





