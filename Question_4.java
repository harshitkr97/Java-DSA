import java.util.Arrays;
import java.util.Scanner;


// find the second largest element in the array
public class Question_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");

        int n = sc.nextInt();

        System.out.println("enter the value in the array");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        int ans = Secondlargest(arr);
        System.out.println("the second largest array is "+ans);


    }

    public static int Secondlargest(int[] arr){

        Arrays.sort(arr);
        int n = arr.length;

        int ans = arr[n-2];
        return ans;
    }
    
    
}
