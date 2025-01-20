package practiceQuestions;
// find out the percentage of 5 subject
public class Question2 {

    double maths;
    double english;
    double urdu;
    double science;
    double computer;

    public Question2( double computer, double science, double urdu, double english, double maths) {

        this.computer = computer;
        this.science = science;
        this.urdu = urdu;
        this.english = english;
        this.maths = maths;
    }

    double percentage(){
        double percentage1 =( this.computer+this.science+this.urdu+this.english+this.maths)/5;
        return percentage1;
    }

    public static void main(String[] args) {
        // creating object of Question2 class
        Question2 average= new Question2(34,45,67,89,78);
        System.out.println("The percentage of 5 subjects is : "+average.percentage());

        if(average.percentage()>50){
            System.out.println("passed");
            if(average.percentage()>90){
                System.out.println("Grade A");

            }
            else if(average.percentage()>80){
                System.out.println("Grade B");
            }
            else if(average.percentage()>70){
                System.out.println("Grade C");

            }
            else if(average.percentage()>60){
                System.out.println("Grade D");
            }
            else {
                System.out.println("Grade E");
            }

        }
        else{
            System.out.println("failed");
        }
    }
}
