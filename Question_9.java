import java.util.Arrays;
import java.util.Scanner;

public class Question_9 {
    // rotate the array by k steps without using extra space

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the value");
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value of k step");
        int k = sc.nextInt();

        kstep(arr, k);
        System.out.println("the rotated array is "+ Arrays.toString(arr));
        
    }

    public static void kstep(int[] arr, int k){
        int n  = arr.length;
        k = k%n;

        swap(arr, 0, n-k-1);
        swap(arr, n-k, n-1);
        swap(arr, 0, n-1);

    }

    public static void swap(int[] arr, int i, int j){
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
