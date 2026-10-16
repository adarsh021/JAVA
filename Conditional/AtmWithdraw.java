public class AtmWithdraw {
    public static void main(String[] args) {
        int amount = 50000;
        int withdraw = 49500;
        int totalBal = amount - withdraw;
        if (amount > withdraw){
            if(amount % 100 == 0){
                if(totalBal >= 1000){
                    System.out.println("Transection successfull  Your remaning blance = "+totalBal);
                }else{
                    System.out.println("You have not enough money");
                }
            }else{
                System.out.println("Error");
            }
        }
    }
}
