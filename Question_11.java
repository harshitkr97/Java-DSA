import java.util.Arrays;
import java.util.Scanner;

public class Question_11 {
    
    // Two pointer Approach

    // sort an array consisting 0s and 1s

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the value in array");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);
        System.out.println("the sorted array is: "+ Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int count = 0;

        for(int i = 0; i<n ; i++){
            if(arr[i] == 0){
                count++;
            }
        }

        for (int i = 0; i < n ; i++){
            if(i<count){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }

    }


}
