package practiceQuestions.ifelse;
// find out if the number is even or odd
public class Question1 {
    int num;

    public Question1(int a) {
        num = a;
    }

    void evenOdd() {
        // check whether the number is even or odd
        if (num % 2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is odd");
        }


    }

    public static void main(String[] args) {
        Question1 check = new Question1(6);
        check.evenOdd();

    }
}
