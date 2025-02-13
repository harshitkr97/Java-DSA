import java.util.Arrays;
import java.util.Scanner;

public class Question_21 {
    // given an integer n, return the first n rows of pascal's triangle. in pascal's triangle each numbeer is the sum of
    //            1
             //  1 1
    //          1 2 1  
    //         1 3 3 1       

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of no of row ");
        int n = sc.nextInt();

        int[][] ans = pascal(n);

        
        PrintArray(ans, n);
    }

    public static int[][] pascal(int n){
        int [][] ans = new int[n][];

        for(int i = 0; i<n; i++){

            // for i th row has i + 1 column
            ans[i] = new int[i+1];

            // for 1st ans last column element is 1
            ans[i][0] = ans[i][i] = 1;

            // for sum of element

            for(int j = 1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }

        }

        return ans;
    }

    public static void PrintArray(int[][] arr, int n){

        for(int i =0; i<arr.length; i++){
            // for starting space

            for(int s = 0; s<n-i-1; s++){
                System.out.print("  ");
            }

            // for printing the tringle
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + "  ");
            }

            System.out.println();

        }
    }
}



// import java.util.Scanner;

// public class Question_21 {
//     // Given an integer n, return the first n rows of Pascal's triangle.

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of rows:");
//         int n = sc.nextInt();

//         int[][] ans = pascal(n);

//         printPascalTriangle(ans, n);
//     }

//     public static int[][] pascal(int n) {
//         int[][] ans = new int[n][];

//         for (int i = 0; i < n; i++) {
//             // i-th row has (i + 1) columns
//             ans[i] = new int[i + 1];

//             // First and last column elements are always 1
//             ans[i][0] = ans[i][i] = 1;

//             // Compute inner values of Pascal's Triangle
//             for (int j = 1; j < i; j++) {
//                 ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
//             }
//         }

//         return ans;
//     }

//     public static void printPascalTriangle(int[][] arr, int n) {
//         for (int i = 0; i < arr.length; i++) {
//             // Print leading spaces for center alignment
//             for (int s = 0; s < n - i - 1; s++) {
//                 System.out.print("  "); // Two spaces for better alignment
//             }

//             // Print Pascal's Triangle values
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + "   "); // Add spaces between numbers
//             }

//             System.out.println(); // Move to the next line
//         }
//     }
// }

