public class Print{
    static void printnForwerd(int arr1[]){
        System.out.print("Your array in forwered direction is ");
        for(int i = 0; i <= arr1.length-1; i++){
            System.out.print(" "+arr1[i]);
        }
        System.out.println();
    }
    static void printnBackwerd(int arr2[]){
        System.out.print("Your Array in backwered direction is ");
        for(int i = arr2.length-1; i >= 0; i--){
            System.out.print(" "+arr2[i]);
        }
        System.out.println();
    }
    static void printfirstlast(int arr[]){
        System.out.print("Your Array printing Except first and last");
        for(int i = 1; i < arr.length-1; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static void printnFirstlast2(int arr[]){
        System.out.print("Your Array printing Except first two and last two");
        for(int i = 2; i < arr.length-2; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static void printnFirstHalf(int arr[]){
        System.out.print("Your First half array");
        for(int i = 0; i < (arr.length)/2; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static void printnlastHalf(int arr[]){
        System.out.print("Ypur last half array");
        for(int i = (arr.length/2)-1; i >= 0; i--){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static void printnSum(int arr[]){
        System.out.print("Your array sum is ");
        int sum = 0;
        for(int i = 0; i <= arr.length-1; i++){
            sum = sum + arr[i];            
        }
        System.out.print(sum);
        System.out.println();
    }
    static void printnProduct(int arr[]){
        System.out.print("Your array product is ");
        int product = 1;
        for(int i = 0; i <= arr.length-1; i++){
            product = product * arr[i];
        }
        System.out.print(product);
        System.out.println();
    }
    static void printnEven(int arr[]){
        System.out.print("Printing array even array");
        for(int i : arr){
            if(i % 2 == 0)
            System.out.print(" "+i);
        }
        System.out.println();
    }
    static void printnOdd(int arr[]){
        System.out.print("printing array odd value"+"");
        for(int i : arr){
            if(i % 2 != 0)
            System.out.print(" "+i);
        }
        System.out.println();
    }
    // static int sum2(int arr[]){
    //     for(int i : arr){
    //         int sum = 0;
    //         if(i >= 20){
    //             for(int j = i; j < )
    //         }
    //     }
    // }
}