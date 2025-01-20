package practiceQuestions.loops;
// print all the numbers from 1 to 100
class PrintingNumbers{
    int num;

    public PrintingNumbers(int num) {
        this.num = num;
    }

    void printNum() {
        for(int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
    void printEven(){
        for(int i = 1; i <= 100; i= i+2) {
            System.out.println(i+ " ");
        }
    }
}
public class Question1 {
    public static void main(String[] args) {
        PrintingNumbers p = new PrintingNumbers(5);
//        p.printNum();
        p.printEven();
    }
}
