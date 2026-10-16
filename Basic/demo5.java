public class demo5
{
    public static void main(String[] args) {
        int p = 40; int c = 55; int m= 28; int o = 43;
        int total = p + c + m + o;
        float perc = (total/400.0f) * 100;
        
        
        if(p < 35 || c < 35 || m < 35 || o < 35){
            System.out.println("fail");
        }else{
            System.out.println("pass and percentage is " + perc);
        }

    }
}