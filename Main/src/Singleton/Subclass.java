package Singleton;

import Access.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);

    }

    public static void main(String[] args) {
        A obj = new A(54,"anee");
        Subclass sub = new Subclass(54,"anee");
//        int n = obj.num;
        int s = sub.num;
//        System.out.println(n);
    }
}
