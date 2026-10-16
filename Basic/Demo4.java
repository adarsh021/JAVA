public class Demo4
{
    public static void main(String[] args) {
        int s1 = 1000; int s2 = 1500; int s3 = 1700; int s4 = 1300;
        int p1 = 1500; int p2 = 1300; int p3 = 2700; int p4 = 2000;
        int stotal = s1 + s2 + s3 + s4;
        int ptotal = p1 + p2 + p3 + p4;
        if(stotal >= 3000){
            float sdis = (stotal * 30) / 100.0f;
            System.out.println("Shirt total dis = "+ sdis);
        }else{
            float sdis = (stotal * 15)/ 100.0f;
            System.out.println("Shirt total dis = "+ sdis);
        }
        if(ptotal >= 4000){
            float pdis = (stotal * 20) / 100.0f;
            System.out.println("Shirt total dis = "+ pdis);
        }else{
            float pdis = (stotal * 15)/ 100.0f;
            System.out.println("Shirt total dis = "+ pdis);
        }
        

    }
}