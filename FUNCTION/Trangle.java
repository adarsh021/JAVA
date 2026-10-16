public class Trangle {
    static boolean possitive(int a, int b, int c){
        if (a > 0 && b > 0 && c > 0)return true;
        return false;
    }
    static boolean checkTriangle(int a, int b, int c){
        if(possitive(a, b, c) == true){
            if((a + b) > c || (b + c) > a || (c + a) > b){
                return true;
            }return false;
        }return false;
    }
    public static void main(String[] args) {
        System.out.println(Trangle.checkTriangle(12, 13, 14));
    }
}
