package practiceQuestions.ifelse;
// program to find out if the three numbers can be the sides of the triangle
class Triangle{
    float a,b,c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void sides(){
        if(a + b > c && b + c > a && a + c > b){
            System.out.println("Triangle sides");
        }
        else
        {
            System.out.println("Triangle not sides");
        }
    }
}
public class Question11 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,4,3);
        triangle.sides();
    }
}
