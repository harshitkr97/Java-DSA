public class Question_45 {
    // given an array of integers print sums of all subsets in it. output sums can be printed in any order

    static void subsetsum(int[] arr, int idx, int sum){

        if(idx >= arr.length){
            System.out.println(sum);
            return;
        }

        subsetsum(arr, idx+1, sum + arr[idx]);

        subsetsum(arr, idx+1, sum);

    }

    public static void main(String[] args) {
        int[] arr = {2,4,5};
        subsetsum(arr, 0, 0);
    }
}
