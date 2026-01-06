package LeetCodeProblem;

public class PalindromeString {
    /*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
    Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
     */
    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();
        System.out.println(palindromeString.isPalindrome("A man, a plan, a canal: Panama"));
    }
    public boolean isPalindrome(String s) {

        int left=0;
        int right=s.length()-1;
        while(left<right){
            char start=s.charAt(left);
            char end=s.charAt(right);
            if(!Character.isLetterOrDigit(start)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                right--;
                continue;
            }
            if(Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
