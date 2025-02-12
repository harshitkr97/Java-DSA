import java.util.Arrays;
import java.util.Scanner;

public class Question_7 {
    // reverse an array consisting of integers value

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.println("enter the value in the aarya");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] reverse = reverseArray(arr);

        System.out.println("reverse array is : " + Arrays.toString(reverse));

    }


    public static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        int j = 0;

        for(int i = n-1; i>=0; i--){
            ans[j++] = arr[i];
            
        }

        return ans;
    }
}
