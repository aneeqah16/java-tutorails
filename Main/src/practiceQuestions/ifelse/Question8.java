package practiceQuestions.ifelse;
// take integer input and check whether it is divisible by 5 or 3
import java.util.Scanner;
public class Question8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
          int number= sc.nextInt();

          fun(15);
    }

    public static void fun(int n) {
        if(n%5==0 || n%3==0){
            System.out.println("This number is either divisible by 3 or 5");
        }
        else {

            System.out.println("This number is not divisible by 5 or 3");

        }
    }
}
