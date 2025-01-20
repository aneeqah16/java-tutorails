package practiceQuestions.ifelse;
//  Write a program to find out if the area of rectangle is greater than its perimeter
class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double perimeter() {
        return length + breadth;
    }
    double area() {
        return length * breadth;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Perimeter of rectangle is : " + rectangle.perimeter());
        System.out.println("Area of rectangle is " + rectangle.area());
    }
}
