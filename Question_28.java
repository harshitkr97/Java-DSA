import java.util.ArrayList;
import java.util.Scanner;

public class Question_28 {
    // find thee fibonacci series 

    public static int fibonacci(int n ){
        // base case 

        if(n== 0 || n== 1  ) return n;


        // sub work
        int prevans = fibonacci(n-1);
        int prevprevans = fibonacci(n-2);

        int ans = prevprevans + prevans;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of x :");

        int n = sc.nextInt();


        // this is for printing all the fibonacci series line by line
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println(fibonacci(n));
    }
}
