import java.util.Arrays;
import java.util.Scanner;

public class Question_17 {
    // Q. sum of two matrix

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of x ");
        int x = sc.nextInt();

        System.out.println("enter the value of y");
        int y = sc.nextInt();

        int [][] arr = new int[x][y];

        System.out.println("enter the value in matrix arr1");
        for(int i = 0; i<x; i++){
            for(int j =0; j<y; j++){
                arr[i][j] = sc.nextInt();
            }
        }



        System.out.println("enter the value of x2 ");
        int x2 = sc.nextInt();

        System.out.println("enter the value of y2 ");
        int y2 = sc.nextInt();

        int [][] arr2 = new int[x2][y2];

        System.out.println("enter the value in matrix arr2");
        for(int i = 0; i<x2; i++){
            for(int j =0; j<y2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        sum(arr, x, y, arr2, x2, y2);
    }



    public static void sum(int[][] arr, int r, int c, int[][] arr2, int r2, int c2){
        if(r != r2  || c != c2 ){
            System.out.println("you enter the wrong matrix ");
        }

        int[][] sum = new int[r][c];

        for(int i =0 ; i<r; i++){
            for(int j =0; j<c; j++){
                sum[i][j] = arr[i][j]+arr2[i][j];
            }
        }

         printArray(sum);
    }


    public static void printArray (int[][] arr){
        for(int i =0 ; i< arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

}
