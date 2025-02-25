import java.util.Scanner;

public class Question_38 {
    //  find the sum of the element of the array 

    public static int sumarr(int[] arr , int idx){
        // base case 

        if(idx == arr.length) return 0;

       int smallsum = sumarr(arr, idx+1);

       int ans = arr[idx] + smallsum;

       return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of arr ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sumarr(arr, 0));
    }
}
