import java.util.Scanner;

public class Question_6 {
    // given two integer a and b. Swap the two given values using temporary variable

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enterr the value of a ");
        int a = sc.nextInt();

        System.out.println("enter the value of b ");
        int b = sc.nextInt();

        Swap(a,b);

    }

    public static void Swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
