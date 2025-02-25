import java.util.Scanner;

public class Question_27 {
    // find the factorial of n no using recurrision

    public static int factorial(int n){
        // base case 
        
        if(n == 0) return 1;


        // small problem work 

        int smallans = factorial(n-1);

        // self work problem

        int ans = n*smallans;
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");

        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}
