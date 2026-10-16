public class Print2 {
    static void printiEvenValue(int arr[]){
        for(int i = 0; i <= arr.length-1;i++){
            if(i % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void printiOddValue(int arr[]){
        for(int i = 0; i <= arr.length-1;i++){
            if(i % 2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void printAvg(int arr[]){
        int sum = 0;
        int count =  0;
        for(int i : arr){
            if(i % 2 == 0){
                count = count + 1;
                sum = sum + i;
            }
        }
        float avg = (float)sum / count;
        System.out.println("avg = "+ avg);
    }
    static void printAvg2(int arr[]){
         // 1 21 3 41 51 6
         // 0 1 2 3 4 5 
        int sum = 0;
        int count =  0;
        for(int i : arr){          
            if(i % 2 != 0 && (i > 9 && i < 100)){
                count = count + 1; // 3
                sum = sum + i; // 113
            }       
        }
        float avg = sum / count;
        System.out.println("avg = "+ avg);
    }
    // static void printCopy(int arr[]){
    //     int arr2[] = {};
    //     for(int i : arr){
            
    //     }
    // }


}
