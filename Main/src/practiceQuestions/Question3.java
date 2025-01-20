package practiceQuestions;
// calculate the simple interest
import java.util.Scanner;
public class Question3 {
    // si = principle * rate * time
    double principle;
    double rate;
    double time;


    public Question3(double principle, double rate, double time) {
        this.principle = principle;
        this.rate = rate;
        this.time = time;
    }

    void Calculate() {
        double si = this.principle * this.rate * this.time;
        System.out.println(si);
    }
    public static void main(String[] args) {
        Question3 simpleint = new Question3(2, 2000, 3);
        simpleint.Calculate();
    }
}
