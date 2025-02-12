import java.util.Arrays;
import java.util.Scanner;

public class Question_12 {
    // given an array of integer "a" move all the event integer at the 1st and than
    // odd integer 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the value in array");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // int[] ans = evenodd(arr);
        
        // System.out.println("the even array is in first and than odd array is: "+ Arrays.toString(ans));

        sortevenodd(arr);

        System.out.println("even array is in the first and than odd array is: "+ Arrays.toString(arr));
    }

    public static int[] evenodd(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for(int i = 0; i<n; i++){
            if(arr[i] %2 == 0){
                ans[j++] = arr[i];
                
            }
        }

        for(int i = 0; i<n; i++){
            if(arr[i] % 2 == 1){
                ans[j++] = arr[i];
            }
        }

        return ans;
    }


    // 2nd methode 
    public static void sortevenodd(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left<right){
            if(arr[left] % 2 == 1 && arr[right] % 2 ==0){
                swapArray(arr, left, right);
                left ++;
                right --;
            }

            if(arr[left] % 2 == 0){
                left ++;
            }
            if(arr[right] % 2 == 1){
                right --;
            }
        }
    }

    static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;

    }

}
