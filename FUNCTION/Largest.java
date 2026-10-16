public class Largest {
    static int checkLargest(int a, int b, int c){
        if (a > b & a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else {
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println(Largest.checkLargest(10,  20, 15));
    }
    
}
