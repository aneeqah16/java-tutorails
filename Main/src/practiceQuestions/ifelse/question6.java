package practiceQuestions.ifelse;
class Divisible{
    int number;

    public Divisible(int number) {
        this.number = number;
    }
    public Divisible(){
        number = 6;
    }
    void showDivisible(){
        if(number%5==0&& number%3==0){
            System.out.println("Divisible by 5 and 3");
        }
        else{
            System.out.println("Not Divisible by 3 and 5");

        }
    }

    public static void main(String[] args) {
        Divisible div = new Divisible(15);
        div.showDivisible();

    }


}

