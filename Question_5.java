import java.util.Scanner;

public class Question_5 {
    // given an array a consisting a integer. return the first value that is repeating
    // otherwise -1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the array element");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = Firstrepeating(arr);
        System.out.println("the first repeating no is " + ans);

    }


    public static int Firstrepeating(int[] arr){

        int n = arr.length;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }

        return -1;
    }
}
