package practiceQuestions.ifelse;
// check whether the number is divisible by 5 or not

public class question2 {
    int num;

    public question2(int num) {
        this.num = num;
    }

    void check(){
        if(num%5==0){
            System.out.println("The number is divisible by 5");
        }else{
            System.out.println("The number is not divisible by 5");

        }
    }

    public static void main(String[] args) {
        question2 obj = new question2(92);
        obj.check();
    }
}
