public class Grade {
    static boolean CheckVailed(int marks){
        if(marks >= 0 && marks <= 100) return true;
        return false;
    }
    static void checkGrade(int marks){
        if (!CheckVailed(marks)){
            System.out.println("Not a vailed marks");
        }else{
            if(marks < 35){
                System.out.println("Fail");
            }else if(marks < 60){
                System.out.println("E");
            }else if(marks < 70){
                System.out.println("D");
            }else if(marks < 80){
                System.out.println("C");
            }else if(marks < 90){
                System.out.println("B");
            }else
                System.out.println("A");            
        }
    }
    public static void main(String[] args) {
        Grade.checkGrade(70);
    }
}
