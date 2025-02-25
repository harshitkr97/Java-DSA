import java.util.Scanner;

public class Question_42 {
    // write a program to print reverse of a string using recursion

    public static String reverseString(String s, int idx){

        if(idx == s.length()) return "";

        String smallans = reverseString(s, idx+1);

        return smallans+s.charAt(idx);
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the character ");

        String s = sc.nextLine();

        System.out.println(reverseString(s, 0));
    }
}
