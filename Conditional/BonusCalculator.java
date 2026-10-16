public class BonusCalculator {
    public static void main(String[] args) {
        int sal = 20000;
        int experi = 2;
        float bonus;
        float finalSal;
        if(experi < 0 || sal <0){
            System.out.println("invailed input");
        }else{
            if (experi < 1){
                System.out.println("No bonus");
            }else{
                if(experi >= 1 && experi < 3){
                    bonus = sal * 5 / 100.0f;
                }else if(experi >= 3 && experi < 5){
                    bonus = sal * 10 / 100.0f;      
                }else{
                    bonus = sal * 15 / 100.0f;
                }
                finalSal = bonus + sal;
                System.out.println("your final sal = " + finalSal);
                System.out.println("Your bonus = "+bonus);
            }
        }
    }
}
