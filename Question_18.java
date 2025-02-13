import java.util.Scanner;

public class Question_18 {
    // multiplication of two matrices 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x1");
        int x = sc.nextInt();
        System.out.println("enter the value of y1");
        int y = sc.nextInt();

        int [][] arr = new int[x][y];
        System.out.println("enter the value in arr1");
        inputarray(arr, x, y, sc);

        System.out.println("enter the value of x2");
        int x2 = sc.nextInt();

        System.out.println("enter the value of y2");
        int y2 = sc.nextInt();

        int [][] arr2 = new int[x2][y2];
        System.out.println("enter thhe value in arr2");
        inputarray(arr2, x2, y2, sc);

        multiplication(arr, x, y, arr2, x2, y2);


    }

    public static void inputarray(int[][] arr, int x, int y , Scanner sc){
        for(int i = 0; i< x ; i++){
            for(int j =0; j<y; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }


    public static void multiplication(int[][] arr, int x, int y, int[][] arr2, int x2, int y2){
        int[][] multilpy = new int[x][y2];
        if(y == x2){
            for(int i = 0; i< x; i++){
                for(int j =0; j< y2; j++){
                    for(int k = 0; k< x2; k++){
                        multilpy[i][j] = (multilpy[i][j] + (arr[i][j] * arr2[k][j]));
                    }
                }
            }

            printArray(multilpy);

        }else{
            System.out.println("enter matrix is not multiplicable ");
        }
    }

    public static void printArray(int[][] arr){
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
