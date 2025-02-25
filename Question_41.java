public class Question_41 {
    // remove all the occurance of 'a' from string s = abcax

    public static String removeOccurance(String s, int idx ){

        if(idx == s.length()) return " ";

        String smallans = removeOccurance(s, idx+1);

        char currentcha = s.charAt(idx);

        if(currentcha != 'a'){
            return currentcha + smallans;
        }else{
            return smallans;
        }
    }

    public static void main(String[] args) {
        String s = "abcaxabbba dssaaa aasss";
        System.out.println(removeOccurance(s, 0));
    }
}
