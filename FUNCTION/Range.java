public class Range {
    static boolean checkRange(int n){
        if(n > 10 && n < 50) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Range.checkRange(20));
    }
}
