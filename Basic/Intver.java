public class Intver {
    public static void main(String[] args) {
        int qCode = 2;
        int sCode = 1;
        int yop = 2026;
        double per = 65;
        if(qCode == 1 || qCode == 2 && sCode == 1 || sCode == 2  && per >= 60 && yop == 2025 || yop == 2026){
            System.out.println("Your are eligible");
        }else{
             System.out.println("Not eligible for intervew");
            if(qCode != 1 && qCode != 2){
                System.out.println("your qualification is not match");
            }if(sCode != 1 && sCode != 2){
                System.out.println("Your stream is not match");
            }if(per <= 60){
                System.out.println("your persentage below 60");
            }if(yop != 2025 && yop != 2026){
                System.out.println("Your passing year is not eligible");
            }    
        }

    }
    }


