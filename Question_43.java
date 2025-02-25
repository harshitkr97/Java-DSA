public class Question_43 {
    // write a program to check given string is palindrome or not 

    public static boolean palidrome(String s, int start, int l){

        if(start>=l) return true;

        if(s.charAt(start) != s.charAt(l)){
            return false;
            
        }
        return palidrome(s, start+1, l-1);
    }

    public static void main(String[] args) {
        String s = "abcbaa";
        System.out.println(palidrome(s, 0, s.length()-1));
    }
}
