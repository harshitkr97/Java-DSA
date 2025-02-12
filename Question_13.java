import java.util.Arrays;
import java.util.Scanner;

public class Question_13 {
    // given an integer array a sorted in non decreasing order, return an array of
    // the square of each numbers sorted in the non decreasing order 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of arra ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the element in the array");

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        // sorted(arr);

        int[] ans = squaresorted(arr);
        System.out.println(Arrays.toString(ans));
    }

    static void sorted(int[] arr){
        int n = arr.length;

        Arrays.sort(arr);
        square(arr);

        System.out.println("square of the numbers is " + Arrays.toString(arr));
        
    }

    static void square(int[] arr){
        for(int i = 0; i< arr.length; i++){
            arr[ i] = arr[i]*arr[i];
        }
    }



    // 2 methods 

    public static int[] squaresorted(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n];
        int k = 0 ;

        while (left<=right) {
            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;

            }
            else{
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }

        return ans;
    }
}
