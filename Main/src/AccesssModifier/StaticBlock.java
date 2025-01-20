package AccesssModifier;
// this the demo to show the initialisation of static variables
public class StaticBlock {
    static int a  = 4;
    static int b;
    // static block will get executed
    // exactly once when the class is first loaded i.e
    // when the first object is created
    static{
        System.out.println("static block");
        // here you can initialise these static variables
        // like for example:
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println("main");
        StaticBlock a = new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);

        StaticBlock.b +=3;
        System.out.println(StaticBlock.b);
    }

}
