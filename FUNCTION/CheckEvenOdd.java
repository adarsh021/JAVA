public class CheckEvenOdd{

    static boolean EvenOdd(int n){
        if(n% 2 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(CheckEvenOdd.EvenOdd(11));
    }
}