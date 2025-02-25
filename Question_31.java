import java.util.Scanner;

public class Question_31 {
    // given a number num and a value k print k multiple of num 

    public static void multiple(int num, int k){

        // base case 
        if(k==1){
             System.out.println(num);
             return;
            }

        // small ans 

         multiple(num, k-1);

        // self problem

        
        System.out.println(num * k);



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of num ");
        int num = sc.nextInt();

        System.out.println("enter the value of k ");
        int k = sc.nextInt();

        multiple(num, k);
    }
}
