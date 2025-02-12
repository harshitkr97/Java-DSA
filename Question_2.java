import java.util.Scanner;

// count the no of triplets whose sum is equal to the given value x. 

public class Question_2 {
    public static void main(String[] args) {
        System.out.println("enter the no of element");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("enter the elements");
        int[] arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the target value");
        int target = sc.nextInt();

        int Pairs = sumOfElement(arr, target);
        System.out.println("no of pairs are " +Pairs);
        

    }

    public static int sumOfElement(int[] arr, int target) {
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i  <n; i++){
            for(int j = i+1; j< n; j++){
                for(int k = j+1; k<n; k++){
                    if(arr[i] + arr[j]+ arr[k] == target){
                        sum++;
                    }
                }
            }
        }

        return sum;
    }
}
