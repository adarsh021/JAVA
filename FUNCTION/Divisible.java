public class Divisible {
    public static boolean div2(int a)
    {
        if(a % 3 == 0 && a % 5 == 0) return true;
        return  false;
    }
    public static boolean div3(int a) {
        if(div2(a) && (a % 10 == 0 && a % 15 == 0)) return true;
        return false;
        
    }
    public static boolean div4(int a) {
        if(div3(a) && (a%20 == 0)) return true;
        return false;
        
    }
    
    public static void main(String[] args) {
        System.out.println(Divisible.div4(20));
    }
}
