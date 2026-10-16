public class Withdraw {
    public static void main(String[] args) {
        int balance = 100000;
        int amount = 97000;
        boolean panCard = true;
        int bankCode = 2; 
        if(amount <= balance){
        if(amount < 50000 || panCard == true){
            balance = balance - amount;
            System.out.println("Transection succesfull");
            if(bankCode == 1){
                if(balance < 10000){               
                    System.out.println("low minimum balance deposite amount for mainten "+ (10000 - balance));
                }else if(bankCode == 2 || bankCode == 4){
                    if(balance < 5000){
                        System.out.println("low minimum balance deposite amount for mainten "+ (5000 - balance));
                    }
                }
            }else{
                System.out.println("low minimum balance deposite amount for mainten "+ (0 - balance));
            } 
            }
 
            }else{
                 System.out.println("link your pancard");
            }
        }
    }


