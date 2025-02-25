import java.util.Scanner;

public class Question_30 {
    // given two no p and q find the value of p^q using recursion function

    public static int exponent(int p , int q){

        // base case
        if(q==0) return 1;

        // small problem

        int smallans = exponent(p, q-1);


        // self problem 

        int ans = smallans * p;
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of p ");
        int p = sc.nextInt();

        System.out.println("enter the value of q ");
        int q = sc.nextInt();

        System.out.println(exponent(p, q));
    }
}
 