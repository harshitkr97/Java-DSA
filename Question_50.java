public class Question_50 {
    // given an array of names of the fruits you are supposed to sort it in lexicographical order using the seledtion sort

    static void setfirst(String[] fruits){

        int n = fruits.length;

        for(int i = 0; i< n-1; i++){

            int min_index = i;

            for(int j = i+1; j<n ; j++){

                if(fruits[j].compareTo(fruits[min_index])<0){
                    min_index = j;
                }
            }

            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }

    public static void main(String[] args){
        String[] fruits = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        setfirst(fruits);

        for(String val : fruits){
            System.out.print(val + " ");
        }
    }
}
