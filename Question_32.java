import java.util.Scanner;

public class Question_32 {
    // given a number n find the sum of natural number till n but alternate sign

    

    public static int sumAlternate(int n){

        // base case 

        if(n==1) return 1;

        // small problem 

        int smallans = sumAlternate(n-1);

        // self work 

        if(n%2 == 0){
            int ans = smallans-n;
            return ans;
        }else{
            int ans = smallans+n;
            return ans;
        }
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n ");
        int n = sc.nextInt();

        System.out.println(sumAlternate(n));
    }
}
