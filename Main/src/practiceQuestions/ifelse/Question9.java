package practiceQuestions.ifelse;
// find the greatest of 3 numbers

class GreatestNumber {
    int number1, number2, number3;


    public GreatestNumber(int num1, int num2, int num3) {
        this.number1 = num1;
        this.number2 = num2;
        this.number3 = num3;
    }
    public int getGreatestNumber() {
        if (number1 > number2 && number1 > number3) return number1;
        else if(number2>number3) return number2;
        else return number3;

    }
}
public class Question9 {
    public static void main(String[] args) {
        GreatestNumber number = new GreatestNumber(33, 14, 5);
        System.out.println(number.getGreatestNumber()+ " is the greatest number");
    }
}
