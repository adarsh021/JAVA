public class Persenet {
    static int total(int a, int b, int c, int d){
        return a + b + c + d;
    }
    static void totalPer(int total){
        float totalper = (total * 100) / 400.0f;
        System.out.println(totalper);
    } 
    public static void main(String[] args) {
        int x = Persenet.total(55, 65, 77, 85);
        Persenet.totalPer(x);
    }
    
}
