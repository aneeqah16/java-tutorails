package polymorphism;

public class Numbers {
    double sum(double a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b ;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(5, 3, 4));
//        obj.sum(5, 3, 4,5); error ==> no such constructor
    }
}
