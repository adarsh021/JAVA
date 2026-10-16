public class Deposite {
    public static void main(String[] args) {
        int balance = 75000;
        int amount = 60000;
        boolean panCard = true;
        if(amount < 50000 || panCard == true){
            balance = balance + amount;
            System.out.println("payment sucsessfull Your total balance is " + balance);
            
        }else{
             System.out.println("Link pancard");
        }
    }
}
