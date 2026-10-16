public class GradeCal {
    public static void main(String[] args) {
        int attend = 85;
        int mark = 65;
        if(attend < 75){
            System.out.println("Not Eligible");
        }else{
        if(mark >= 0 && mark < 40){
            System.out.println("fail");
        }else if(mark >= 40 && mark < 60){
            System.out.println("D");
        }else if(mark >= 60 && mark < 70){
            System.out.println("C");
        }else if(mark >= 70 && mark < 80){
            System.out.println("B");
        }else if(mark >= 80 && mark < 90){
            System.out.println("A");
        }else if(mark >= 90 && mark < 100){
            System.out.println("A+");
        }else{
            System.out.println("Invailed marks");
        }
    }
    }
}
