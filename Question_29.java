import java.util.Scanner;

public class Question_29 {
    // find the sum of digit present in no 

    public static int sumOfdigit(int n ){

        // base case 
        if(n>= 0 && n<= 9){
            return n;
        }

        // small problem

        int smallans = sumOfdigit(n/10);

        // self problem

        int ans = smallans + n%10;

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x ");

        int n = sc.nextInt();

        System.out.println(sumOfdigit(n));
    }
}
