import java.util.Scanner;

public class Question_49 {
    // given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non-zero element

    static void sortBubble(int[] arr){

        int n = arr.length;

        for(int i =0 ; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        sortBubble(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
