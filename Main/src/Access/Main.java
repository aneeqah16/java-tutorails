package Access;

public class Main  {
    public static void main(String[] args) {
        A obj = new A(10,"Anee");

        // need to do few things
        //1. access the data members
        //2. modify the data members

        // to get the private value

        obj.getNum();
        int n = obj.num;

        int a1  = 1;
        int a2  = 2;
        int sum = a1 + a2;
    }
}
