public class ElectrictyBill{
    public static void main(String[] args) {
        int unit = 300;
        int bill;
        if(unit <= 100){
            bill = unit * 5;
        }else if(unit <= 200){
            bill = 500 + ((unit - 100) * 7);
        }else{
            bill = 1200 + ((unit - 200) * 10);
            System.out.println("Your bill = "+bill);
        }
        if(bill > 2000){
            float s = (bill * 5) / 100.0f;
            float total = s + bill;
            System.out.println("Your Total bill = "+total);
        }else{
            System.out.println(bill);
        }
    }
}