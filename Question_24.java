import java.util.Scanner;

public class Question_24 {
    

    // given a matrix 'a' of dimension n*m and 2 coordinates (l1,r1) and (l2,r2) retun
    // the sum of the rectangle from (l1, r1) to (l2, r2)


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of row " );
        int x = sc.nextInt();

        System.out.println("enter the no of column");
        int y = sc.nextInt();

        int[][] arr = new int[x][y];
        System.out.println("enter the value in the matrix ");
        for(int i =0; i<x; i++){
            for(int j=0; j<y; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printarray(arr);

        System.out.println("enter the value of x1");
        int x1 = sc.nextInt();
        System.out.println("enter the value of y1");
        int y1 = sc.nextInt();
        System.out.println("enter the value of x2");
        int x2 = sc.nextInt();
        System.out.println("enter the value of y2");
        int y2 = sc.nextInt();

        sumbetweenrange(arr, x1, y1, x2, y2);

        // second methode
        sumbetweenrangesecond(arr, x1, y1, x2, y2);
    }

    public static void sumbetweenrange(int[][] arr, int x1, int y1, int x2, int y2){
        int sum = 0;
        int left = y1;
        int right = y2;
        int top = x1;
        int bottom = x2;

        // left to right
        for(int j = left; j<=right; j++){
            sum = sum + arr[top][j];

        }
        top++;
        
        // top to bottom 
        for(int i = top; i<= bottom; i++){
            sum = sum + arr[i][right];
        }
        right--;

        // right to left

        for(int j = right; j>= left; j--){
            sum = sum+ arr[bottom][j];
        }
        bottom--;

        // bottom to top

        for(int i = bottom; i>= top; i--){
            sum = sum + arr[i][left];
        }
        left++;

        System.out.println( "the sum of the no in the range is "+sum);
    }


    // second method 

    public static void sumbetweenrangesecond(int[][] arr, int x1, int y1, int x2, int y2){
        int sum = 0;
        for(int i = x1 ; i<= x2; i++){
            for(int j = y1; j<=y2; j++){
                sum += arr[i][j];
            }
        }

        System.out.println("the sum of second methode is " + sum);
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
