import java.util.Scanner;

public class Question_37 {
    // print the max value of array using recursion 

    public static int printMax(int[] arr, int idx){

        if(idx == arr.length -1 ) return arr[idx];

        int max = printMax(arr, idx +1);

        return Math.max(arr[idx], max);
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2,44,5,6,2,5};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr n");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println(printMax(arr, 0));

        
    }

}
