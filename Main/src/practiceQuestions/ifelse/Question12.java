package practiceQuestions.ifelse;
// check the youngest of three ages
public class Question12 {
    int age1, age2, age3;

    public Question12(int age1, int age2, int age3) {
        this.age1 = age1;
        this.age2 = age2;
        this.age3 = age3;
    }

    void checkAge() {
        if(age1 < age2 && age1 < age3) {
            System.out.println(age1+ " is youngest");
        }else if( age2 < age3) {
            System.out.println(age2+ " is youngest");
        }else{
            System.out.println(age3+ " is youngest");
        }
    }

    public static void main(String[] args) {
        Question12 obj = new Question12(7,8,28);
        obj.checkAge();
    }
}
