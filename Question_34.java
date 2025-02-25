import java.util.Scanner;

public class Question_34 {
    // given two no x and y. find the greatest common divisor of x and y by recursion methods


    public static int gcd(int x , int y){

        if(y == 0) return x;

        int smallans = gcd(y, x%y);
        return smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of x ");
        int x = sc.nextInt();

        System.out.println("enter the value of y ");
        int y = sc.nextInt();

        System.out.println(gcd(x, y));
    }
}
