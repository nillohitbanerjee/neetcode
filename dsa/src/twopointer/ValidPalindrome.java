package twopointer;

public class ValidPalindrome {

    public static void main (String[] args){
        System.out.println(isPalindrome("\"A man, a plan, a canal: Panama\""));
        System.out.println(isPalindrome("race a car"));
    }
    public static boolean  isPalindrome(String s) {
        int startPointer = 0 ;
        int endPointer = s.length()-1;
        while(startPointer<=endPointer){
            char start = s.charAt(startPointer);
            char end = s.charAt(endPointer);

            if(!Character.isLetterOrDigit(start)){
                startPointer++;
            }
            else if(!Character.isLetterOrDigit(end)){
                endPointer--;
            }
            else if(Character.toUpperCase(start)!=Character.toUpperCase(end)){
                return false;
            }
            else{
                startPointer++; endPointer--;
            }
        }

        return true;
    }
}
