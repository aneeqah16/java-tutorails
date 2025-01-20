package Singleton;

public class Main {


    public static void main(String[] args) {
      Singleton1 obj = Singleton1.getInstance();
      Singleton1 obj2 = Singleton1.getInstance();

      Singleton1 obj3 = Singleton1.getInstance();
      // all three reference variables are pointing to just one object

    }
}
