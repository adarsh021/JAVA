public class Leepyear {
    public static void main(String[] args) {
        int month = 2;
        int year = 2000;
        if(month >= 1 && month <= 12){
            if(month == 2 ){
                if (year % 400 == 0 && (year % 100 != 0 && year % 4 == 0)){
                    System.out.println("This mont is 29 days month");
                }else{
                     System.out.println("This month is 28 days");
                }
            }else if(month == 4 || month == 6 || month == 9 || month == 11){
                System.out.println("This month is 30 days month");
            }else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                System.out.println("This month is 31 day month");
            }else{
                System.out.println("Invailed month");
            }
        }
    }
}
