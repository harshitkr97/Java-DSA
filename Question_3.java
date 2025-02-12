import java.util.Scanner;

// find the unique number in a given array whose all the element are being repeated 
// twice with one value being unique.


public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enterr the no of element");
        int n = sc.nextInt();

        System.out.println("enter the no in the array");

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int UniqueNoCount = count(arr);
        System.out.println("the unique no is "+ UniqueNoCount);
    }


    public static int count(int[] arr){
        int n = arr.length;
        int ans = -1;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        

        for (int i =0; i<n; i++){
            if(arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;
    }
}
