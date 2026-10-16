public class Addmision {
    static boolean checkAdmission(int age, int marks){
        if(age >= 17 && marks >= 60) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Addmision.checkAdmission(23, 70));
    }
}
