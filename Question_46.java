public class Question_46 {
    // bubble sort 

    // sort the array using bubble sort 

    static void bubbleSort(int[] arr){

        int n = arr.length;

        for(int i =0; i<n-1; i++){
            for(int j = 0 ; j < n-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3};
        bubbleSort(arr);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
