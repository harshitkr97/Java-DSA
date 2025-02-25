import java.util.Scanner;

public class Question_39 {
    // given an array of n integers and a target value x print whether x exist in the array or not 

    public static boolean existornot(int[] arr, int idx, int x){

        if(idx == arr.length) return false;

        if(arr[idx] == x) return true;

        if(existornot(arr, idx+1, x)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arrya ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(existornot(arr, 0, 4));
    }
}
