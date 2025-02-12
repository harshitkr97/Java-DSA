import java.util.Scanner;

public class Question_10 {
    // given  Q queries , check if the given number is present in the array or not 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");

        int n = sc.nextInt();

        System.out.println("enter the element in the array");
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] freq = frequency(arr);

        System.out.println("enter the no of queries");
        int q = sc.nextInt();

        

        while (q>0) {
            System.out.println("enter the number which you want to search");
            int k = sc.nextInt();

            if(freq[k] >0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;

        }
    }

    public static int[] frequency(int[] arr){
        
        int n = arr.length;
        int[] freq = new int[100005];

        for(int i = 0; i<n ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}
