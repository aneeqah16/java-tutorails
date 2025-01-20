package practiceQuestions.ifelse;
// Given three points (x1,y1), x2,y2), (x3,y3), wap to check if all the three points fall on one straight line
class LieonaStraight{
    float x1,x2,y1,y2,x3,y3;

    public LieonaStraight(float x1, float y1, float x2, float y2,float x3,float y3) {
        this.x1 = x1;
        this.y1= y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    void CheckSlope(){
        double m1 =(y2-y1)/(x2-x1);
        double m2 =(y3-y2)/(x3-x2);

        if(m1 == m2){
            System.out.println("Points lie on the same line");
        }
        else{
            System.out.println("Points does not lie on the same line");
        }
    }
}
public class Question13 {
    public static void main(String[] args) {
        LieonaStraight lie = new LieonaStraight(1,2,2,4,3,6);
        lie.CheckSlope();
    }

}
