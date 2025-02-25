import java.util.Scanner;

public class Question_25 {

    // pre calculating the horizontal sum for each row in the matrix 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of x ");
        int x = sc.nextInt();

        System.out.println("enter the value of y");
        int y = sc.nextInt();

        int [][] arr = new int[x][y];

        System.out.println("enter the value in the matrix ");
        for(int i = 0; i<x ; i++){
            for(int j = 0; j< y; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        PrintArray(arr);
        int[][] ans = presum(arr, x, y);

        System.out.println();
        PrintArray(ans);

    }

    public static int[][] presum(int[][] arr, int x, int y){
        int[][] ans = new int[x][y];
        int sum = 0;

        for(int i =0; i<x; i++){
            for(int j =0; j<y; j++){
                sum = sum + arr[i][j];
                ans[i][j] = sum ;
            }
            sum = 0;
        }

        return ans;
    }

    public static void PrintArray(int[][] arr){
        for(int i =0; i< arr.length; i++ ){
            for(int j= 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
