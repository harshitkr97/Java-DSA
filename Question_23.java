import java.util.Scanner;

public class Question_23 {
    // given a positive integer n, generate an n*n matrix filled with elements from
    // 1 to n^2 in spiral order 

    // like when i enter the valu of n = 4 than the square of 4 is 16 and than it print
    // this the matrix form 1 to 16 is spiral methode


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of n ");
        int n = sc.nextInt();
        int[][] ans = spiralsquareMatrix(n);
        printarray(ans);
    
        
    }

    public static int[][] spiralsquareMatrix(int n){
        int [][] arr = new int[n][n];

        int top = 0;
        int right  = n-1;
        int bottom = n-1;
        int left = 0;
        int totalelement = 1;

        while (totalelement <= n*n) {
            // for left to right 

            for(int j = left; j<= right && totalelement<= n*n; j++){
                // System.out.print(arr[top][j]+ " ");
                arr[top][j] = totalelement++;
                
            }
            top++;

            // for top to bottom 
            for(int i = top; i<=bottom && totalelement <= n*n; i++){
                // System.out.print(arr[i][right] + " ");
                arr[i][right] = totalelement++;
                
            }
            right--;

            // for right to left
            for(int j= right; j>=left && totalelement <= n*n; j--){
                // System.out.print(arr[bottom][j] + " ");
                arr[bottom][j] = totalelement++;
                
            }
            bottom--;

            // for bottom to top
            for(int i = bottom; i>=top && totalelement <= n*n; i--){
                // System.out.print(arr[i][left] + " ");
                arr[i][left] = totalelement++;
                
            }
            left++;
        }
        return arr;
    }

    

    public static void printarray(int[][]  arr){
        for(int i =0 ; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
