package Singleton;
// singleton class create only one object and that can be done
// when we don't allow people to use constructor more than once
public class Singleton1 {
//    private int number = 0;
   private Singleton1(){
        // private means that it can be only used in
        // this class only
    }
    private static Singleton1 instance;
   // since this instance is not gonna be dependent on an object
   // of this class , hence i can put this static as well
   public  static Singleton1 getInstance(){
    // check whether only one object is created or not
       if(instance == null){
           // if instance is ny default null i.e no object is being created
           //then in that case
           instance = new Singleton1();
           // create an object
           // here we can call the constructor
           // because its present in the same file
       }
       return instance;

       // in short if the instance(one allowed object) is not being created
       // it will create it in the end it will just return it
   }
}
