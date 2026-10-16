public class Calculater {
    static int calculate(int a, int b, char op){
        if(op == '+') return a + b;
        else if(op == '-') return a - b;
        else if(op == '*') return a * b;
        else if(op == '/') return a / b;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(Calculater.calculate(10, 20, '*'));
    }
}
