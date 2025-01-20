package practiceQuestions.ifelse;
// WAP to find the profit/ loss
public class Question4 {
    long cost_price;
    long sell_price;

    public Question4(long cost_price, long sell_price) {
        this.cost_price = cost_price;
        this.sell_price = sell_price;
    }

    void profitLoss(){
       if (cost_price > sell_price) {
           System.out.println("loss");

       }else if (cost_price == sell_price) {
           System.out.println("tie");
       }
       else {
           System.out.println("profit");
       }
    }

    public static void main(String[] args) {
        Question4 q = new Question4(200, 300);
        q.profitLoss();
    }
}
