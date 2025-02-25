import java.util.Scanner;

public class Question_35 {
    // for finding Lcm we use the relation 


    // lcm = x*y / hcf


    public static int gdc(int x, int y){

        if(y == 0) return x;

        return gdc(y, x%y);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("enter the value of x ");
         int x = sc.nextInt();

         System.out.println("enter the value of y ");
         int y = sc.nextInt();

         int gdc = gdc(x, y);

         int ans = (x*y)/gdc;

         System.out.println(ans);
    }
}
