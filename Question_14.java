import java.util.Arrays;
import java.util.Scanner;

public class Question_14 {
    // given an integer array 'a' return the prefix sum running sum in the same array
    // without creating a new array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of arra ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the element in the array");

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = sumprefix(arr);
        System.out.println("the prefix sum is " + Arrays.toString(ans));

    }

    public static int[] sumprefix(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        ans[0] = arr[0];

        for(int i = 1; i<n; i++){
            ans[i] = ans[i-1] + arr[i];
        }

        return ans;
    }
}
