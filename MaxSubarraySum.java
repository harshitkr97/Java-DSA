import java.util.Scanner;


// find the pairs of no in the given array whose sum is equal to the given value
public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value");
        int target = scanner.nextInt();
        
        int maxSum = findMaxSubarraySum(numbers, target);

        System.out.println("pair of element which provide sum of 7 is: " + maxSum);
        
        scanner.close();
    }

    public static int findMaxSubarraySum(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i< n; i++ ){
            for (int j = i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    ans++;
                }
            }
        }

        return ans;
        
    }


    


    



}
