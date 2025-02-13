import java.util.Scanner;

public class Question_19 {
    // print the transpose matrix 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of row or x value");
        int x = sc.nextInt();

        System.out.println("enter the value of y");
        int y = sc.nextInt();

        System.out.println("enter the vlaue in the array ");
        int[][] arr = new int[x][y];

        for(int i =0; i< x ; i++){
            for(int j =0; j<y; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printArray(arr);
        System.out.println();
        // transpose(arr, x, y);
        transposewithoutnewArray(arr, x, y);
        


    }


    static void transpose(int[][] arr, int x, int y){
        int[][] transpose = new int[y][x];

        for(int i = 0; i< x ; i++){
            for(int j = 0; j < y; j++){
                transpose[j][i] = arr[i][j];
            }
        }

        printArray(transpose);
    }


    static void printArray(int[][] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }


    // 2 methode 

    // it only work with square matrices 

    public static void transposewithoutnewArray(int[][] arr, int r, int c){

        for(int i = 0 ; i< r; i++){
            for(int j = i+1; j< c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        printArray(arr);
    }
}
