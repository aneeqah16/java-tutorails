package practiceQuestions.ifelse;

// Given a point (x1,y1), wap to check if the point lie on x axis , y axis or origin
class CheckpointLies{
    float x1,y1;

    public CheckpointLies(float x1, float y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    void Check(){
        if (x1==0 && y1==0){
            System.out.println("point lies on origin");
        }
        else if (x1==0){
            System.out.println("point lies on y-axis");
        }
        else if (y1==0){
            System.out.println("Point lies on X- axis");
        }
        else {
            System.out.println("The point has coordinates ("+x1+","+y1+")");
        }

    }
}
public class Question14 {
    public static void main(String[] args) {
        CheckpointLies point = new CheckpointLies(0,2);
        point.Check();


    }

}
