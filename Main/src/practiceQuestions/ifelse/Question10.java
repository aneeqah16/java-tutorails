package practiceQuestions.ifelse;
// check the greatest of four numbers
public class Question10 {

    static  class four{
        int a,b,c,d;

        public four(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        void fun(){
            if(this.a>this.b && this.a>this.c && this.a>this.d){
                System.out.println(this.a + " is greatest");
            } else if (this.b>this.c && this.b>this.d) {
                System.out.println(this.b + " is greatest");
            }else if(this.c>this.d){
                System.out.println(this.c + " is greatest");
            }else{
                System.out.println(this.d + " is greatest");
            }
        }



    }

    public static void main(String[] args) {
        four number = new four(3,4,15,6);
        number.fun();
    }
}
