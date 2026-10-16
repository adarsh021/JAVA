public class Dis {
    public static void main(String[] args) {
        int s1 = 1300; int s2 = 1500; int s3 = 2000; int s4 = 4000;
        int p1 = 1700; int p2 = 2500; int p3 = 2700; int p4 = 3000;
        int stotal = s1 + s2 + s3 + s4;
        int ptotal = p1 + p2 + p3 + p4;
        float dis = 0f;
        if(stotal > 1000 && stotal < 2000){
            dis = dis + (stotal * 0.9f); 
        }else if(stotal >= 2000 && stotal < 3000){
            dis = dis + (stotal * 0.8f);
        }else if(stotal >= 3000 && stotal < 4000){
            dis = dis +(stotal * 0.7f);

        }else if(stotal >= 4000){
            dis = dis + (stotal * 0.6f);
        }else{
            dis = dis + stotal;
        }
         if(ptotal < 2000){
            dis = dis + (ptotal * 0.85f); 
        }else if(ptotal >= 2000 && ptotal < 3000){
            dis = dis + (ptotal * 0.75f);
        }else if(ptotal >= 3000 && ptotal < 4000){
            dis = dis +(ptotal * 0.7f);
        }else{
            dis = dis + (ptotal * 0.5f);
        }
        System.out.println("total amount is " + dis + "rs" );
        
    }
}
