public class WrapperExamples {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num =  45;
        // Here we created this as integer as an object
        Integer a = 10;
        Integer b = 20;

        swap(a,b);

        System.out.println(a +" "+b);
        // why isn't it swapping the numbers if we are passing object to it
        // because of the final keyword in Integer class
        // final keyword is used when you want a variable to
        // always store the same value

       final A aneeqah = new A("Aneeqah Ashraf");
       // when a non primitive is final , you cannot reassign it.
       aneeqah.name = "other name";
        System.out.println(aneeqah.name);


    }



   static void swap (Integer a, Integer  b) {
        // it's like passing the reference variable to it
       // if we pass objects to it
        int temp = a;
        a = b;
        b = temp;
    }
    static class A {
        final int number = 2;

        // error if not intialized
        String name;


        // because the final variable needs to be initialized
        // always initialize it while declaring it
//        and its only true for primitive data types
//        if final keyword is used with the
//        non primitive data types we can change its value
        public A(String name) {
            this.name= name;
        }
//        @Override
//        protected void finalize() throws Throwable {
//            System.out.println("Object is destroyed");
//        }



    }


}
