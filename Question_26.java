import java.util.Scanner;

public class Question_26 {

    // print the number from n to 1 using recursive function 

    public static void decrisingno(int n){

        // base case 
        if(n==0) return ;


        // self work 

        System.out.println(n);

        // smaller problem

        decrisingno(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();

        decrisingno(n);
    }
}
