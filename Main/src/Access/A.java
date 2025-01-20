package Access;
//default one :in the same package and stuff it's going to allow
// public : can be used everywhere in the every package
// for protected, we can access them in the different packages
//only when we are accessing it using the subclass no even using the parent class itself

public class A {
   protected int num;
    String name;
    int []arr;

    public int getNum() {
        return num;
    }
//    this method is public , this method can be accessed form anywhere
    // getter gets the value and setter sets the value

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int [num];
    }


}
