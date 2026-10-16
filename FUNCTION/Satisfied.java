public class Satisfied {
     static boolean isPositive(int n){
        if(n >= 0) return true;
        return false;
     } 
     static boolean isEven(int n) {
        if (n % 2 == 0) return  true;
        return false;
     }
     static boolean isDivisibleBy3(int n){
        if(n % 3 == 0) return true;
        return false; 
     }
    public static void main(String[] args) {
        int n = 20;
        if((isDivisibleBy3(n)) && (isEven(n)) && (isPositive(n))){
            System.out.println("This number setisfied all the three condition");
        }else{
            System.out.println("This number not setisfied all condition");
        }
    }
    
}
