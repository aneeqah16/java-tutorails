package AccesssModifier;

import Access.A;
import Access.Subclass;

public class Main {
    public static void main(String[] args) {
        Human anee = new Human(20,"Aneeqah Ashraf",10000, false);
        Human eman = new Human(21, "Eman Zaffar", 70000, true);
        Human irtiza = new Human(45,"Irtiza Manzoor",5000,true);
//        System.out.println(anee.salary);
//        System.out.println(eman.salary); System.out.println(irtiza.name);
//        System.out.println(Human.population);

    //greeting();
        Main funn = new Main();
        funn.fun2();
        A a  = new A(32,"haami");
        a.getNum();
//        int n = a.num;
        Subclass s  = new Subclass(13,"haami");
//        int n = s.num;



}
// we know that something which is non static, belongs to an object
void greeting(){
    System.out.println("Hello World");
}

static void fun(){
//        greeting();  // you cant use this because it requires
//    an instance but the function you are using it in does not
//    depend on instances

    // you cannot access non static stuff without referencing their
//    instances in a static context
    Main obj = new Main();
    obj.greeting();

}
void fun2(){
        greeting();
}
}

// static