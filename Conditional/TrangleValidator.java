public class TrangleValidator {
    public static void main(String[] args) {
        int l = 5;
        int b = 7; 
        int h = 10;
        if((l + b) <= h && (b + h) <= l && (l + h) <= b){
            System.out.println("Invailed Trangle");
        }else{
            if(l == b && b == h){
                System.out.println("Equilateral");
            }else if(l == b || b == h || h == l){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }
    }
}
