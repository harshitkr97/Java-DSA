import java.util.Arrays;
import java.util.Scanner;

public class Question_8 {
    // rotate the given array 'a' by k step where k is non negative.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array ");
        int n = sc.nextInt();

        System.out.println("enter the element in array");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the no of step movement");
        int k = sc.nextInt();

        int[] stepanswer = rotate(arr, k);
        System.out.println("after moving k step " + Arrays.toString(stepanswer));

    }

    public static int[] rotate(int[] arr, int k){
        int n = arr.length;
        int[] ans = new int[n];
         
        k = k%n;

        int j = 0;
        

        for(int i = n-k; i <n ; i++){
            ans[j++] = arr[i];
        }

        for(int i = 0; i<n-k; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }


}
