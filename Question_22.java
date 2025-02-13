import java.util.Arrays;
import java.util.Scanner;

public class Question_22 {
    // given an n x m matrix 'a', return all element of the matrix in spiral order

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");

        int x = sc.nextInt();

        System.out.println("enter the value of y");

        int y = sc.nextInt();


        System.out.println("enter the value in the array");
        int[][] arr = new int[x][y];

        for(int i =0; i<x; i++){
            for(int j = 0; j<y; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        PrintArray(arr);
         
        
        spiral(arr, x, y);

        // System.out.println(spiral(arr, x, y););
    }


    public static void PrintArray(int[][] arr){
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }

            System.out.println();
        }
    }

    public static void spiral(int[][] arr, int x, int y){
        int leftcol = 0;
        int rightcol = y-1;
        int toprow = 0;
        int bottomrow = x-1;
        int totalresult = 0;

        while (totalresult < x*y) {
            // left to right 

            for(int j = leftcol; j <= rightcol && totalresult< x*y; j++){
                System.out.print(arr[toprow][j]+ " ");
                totalresult ++;
                
            }
            toprow++;

            // toprow to bottomrow

            for(int i = toprow; i<= bottomrow && totalresult< x*y; i++){
                System.out.print(arr[i][rightcol]+ " ");
                totalresult++;
            }
            rightcol--;

            // right column to left
            for(int j = rightcol; j>=leftcol && totalresult< x*y; j--){
                System.out.print(arr[bottomrow][j]+ " ");
                totalresult ++;
            }

            bottomrow--;

            // bottom row to top row

            for(int i = bottomrow; i>=toprow && totalresult< x*y; i--){
                System.out.print(arr[i][leftcol] + " ");
                totalresult ++;
            }
            leftcol++;
        }

        
        

    }
}
