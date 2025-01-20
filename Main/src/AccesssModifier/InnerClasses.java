package AccesssModifier;

public class InnerClasses {
    // outside classes cannot be static because
    // its not itself dependent on any other class
   static class TestClass {
        String name;

        public TestClass(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        TestClass obj1 = new TestClass("Aneeqah");
        TestClass obj2 = new TestClass("Eman");
        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
