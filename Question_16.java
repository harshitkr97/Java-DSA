import java.util.Scanner;

public class Question_16 {
    // check if we can partition the array into two subarray with equal sum more formally check that the prefix
    // sum of a part of the array is equal to the suffix sum of the rest of the array


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of arra ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the element in the array");

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        prefixsum(arr);

        System.out.println(prefixsum(arr));
    }

    public static int totalsum(int[] arr) {
        int sum = 0;
        for(int i = 0 ; i< arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static boolean prefixsum(int[] arr){
        int total = totalsum(arr);
        int presum = 0;

        for (int i =0; i<arr.length; i++){
            presum = presum + arr[i];
            int suffixsum = total - presum;

            if(presum == suffixsum){
                return true;

            }
            
        }
        return false;
    }
}
