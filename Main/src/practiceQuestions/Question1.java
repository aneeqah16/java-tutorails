package practiceQuestions;
// find out the volume of sphere
public class Question1 {
    double r;
    final double pi = 3.14;
    public Question1(double r) {
        this.r = r;

    }
    void volume(){
        double volume = 4 * pi * r * r * r/3;
        System.out.println("Volume is " + volume);
    }

    public static void main(String[] args) {
        Question1 sphere = new Question1(3);
        sphere.volume();
    }
}
