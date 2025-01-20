package practiceQuestions.ifelse;
// check whether a number is a three digit or not
 class CheckDigit{
    int digit;

     CheckDigit(int digit) {
        this.digit = digit;
    }

    void checkDigit() {
         if(digit>99 && digit<1000){
             System.out.println("The number is a three digit number");
         }
         else{
             System.out.println("The number is a not a three digit number");
         }
    }
}
public class Question7 {
    public static void main(String[] args) {
        CheckDigit number = new CheckDigit(5000);
        number.checkDigit();
    }
}
