public class Question_48 {
    // sort the algorithm using insertion sort 

    static void Insertionsort(int[] arr){

        int n = arr.length;

        for(int i = 1; i<n; i++){

            int j = i;

            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {8,3,6,5,4,2};

        Insertionsort(arr);

        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
