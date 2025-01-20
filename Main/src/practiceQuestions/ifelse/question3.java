package practiceQuestions.ifelse;
// check if the year is leap year or not
public class question3 {
    int year;

    public question3(int year) {
        this.year = year;
    }
    public question3(){
        this.year = 2024;
    }
    void display() {
        if(year%4 == 0 && year%100!=0 || year%400 == 0) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }

    }

    public static void main(String[] args) {
        question3 ob = new question3();
        ob.display();

    }
}

