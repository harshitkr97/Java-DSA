import java.util.Scanner;

public class Question_20 {
    // given a square matrix, turn it by 90 degree in a clockwise direction without using any extra space


    // approach :- in this first we transpose the array and than reverse it

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of x");
        int x = sc.nextInt();

        System.out.println("enter the value of y");
        int y = sc.nextInt();

        System.out.println("enter the value of arrya");
        int [][] arr = new int[x][y];

        for(int i =0; i<x; i++){
            for(int j = 0; j<y; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        System.out.println();

        transpose(arr, x, y);
        System.out.println("here is the 90degree rotate matrix");
        reverseArray(arr);


    }

    public static void transpose(int[][] arr, int x, int y){
        for(int i =0; i<x; i++){
            for(int j = i+1; j<y; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        printArray(arr);
    }


    public static void printArray(int[][] arr){
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseArray(int[][] arr){
        
        for(int i =0; i< arr.length; i++){
            int left = 0;
           int right = arr.length-1;


            while (left<right) {
                
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i] [right] = temp;


                left++;
                right--;
            }
        }
        printArray(arr);
    }
}
