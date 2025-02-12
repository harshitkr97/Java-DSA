import java.util.Arrays;
import java.util.Scanner;

public class Question_15 {
    // given an arr of integer of size n. answer a queries. where you need to print
    // the sum of values in a given range of indices from 1 to r (both included)


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of arra ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the element in the array");

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the starting value ");
        int s = sc.nextInt();

        System.out.println("enter the last point ");
        int l = sc.nextInt();

        System.out.println("enter the no of query");
        int q = sc.nextInt();

        
        sumrange(arr, s, l);
        
        

    }

    public static void sumrange(int[] arr, int s, int l){

        int n = arr.length;
        int ans = 0;

        for(int i = s; i<= l ; i++){
            ans = ans + arr[i];
        }
        System.out.println("the sum is " + ans);
    }


}
