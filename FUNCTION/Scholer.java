public class Scholer{
    static boolean Eligiblity(int marks, int income){
        if(marks >= 85 && income > 300000) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Scholer.Eligiblity(77, 400000));
    }
}