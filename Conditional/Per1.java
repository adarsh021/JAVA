public class Per1 {
    public static void main(String[] args) {
        int p = 75; int c = 65; int m = 60;
        float total = p + c + m; float per = (total * 100) / 300;
        if(p  < 35 || c < 35 || m < 35){
            if(p < 35){
                System.out.println("You are fail in physics " + "");
            }if(c < 35){
                System.out.println("You are fail in chemistry " + "");
            }if(m < 35){
                System.out.println("You are fail in mathematic" + "");
            }
        }else{          
            if(per < 60){
                System.out.println("You are pass with second class " + per);
            }else if(per < 80){
                System.out.println("You are pass with first class " + per);
            }else{
                System.out.println("You are pass with distinct " + per);
            }
          }

        }
    }

