import java.util.Scanner;

public class Question_40 {
    // given an array arr of size N and an integer X. the task is to find all the 
    // indices of the integer x in the arr.


    public static void indices(int[]arr, int idx, int x){

        if(idx == arr.length) return ;

        if(arr[idx] == x){
            System.out.println(idx+ " ");
        }

        indices(arr, idx+1, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the sizee of arrya ");

        int n = sc.nextInt();
        int[]arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the target element ");
        int x = sc.nextInt();

        indices(arr, 0, x);

       
    }
}
