public class Interview {
    public static void main(String[] args) {
        int qCode = 2;
        int sCode = 1;
        int yop = 2026;
        double per = 65;
        if(qCode == 1 || qCode == 2){
            if(sCode == 1 || sCode == 2 || sCode == 5){
                if(per >= 60){
                    if(yop == 2025 || yop == 2026){
                        System.out.println("your are eligible");
                    }else{
                        System.out.println("your passing year is not eligible");
                    }

                }else{
                    System.out.println("Your percentage is below 60%");
                }
            }else{
                System.out.println("Your stream is not match");
            }
            }else{
                System.out.println("your qualification is not match");
        }
    }
}
