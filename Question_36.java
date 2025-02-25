import java.util.Scanner;

public class Question_36 {
    // given an array , print all its values recursively


    public static void printarray(int[] arr, int idx){

        if(idx == arr.length) {
            return ;
        } 

        System.out.print (arr[idx] + " ");

        printarray(arr, idx+1);

            
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};

        printarray(arr, 0);


    }
}
