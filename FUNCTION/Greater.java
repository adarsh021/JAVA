public class Greater {
    static int great(int a, int b){
        if(a > b)return a;
        return b;
    }
    public static void main(String[] args) {
        System.out.println(Greater.great(10,9));
    }
}
