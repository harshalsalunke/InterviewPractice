package LeetCodeProblem;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {
    public void main(String[] args)
    {
        LongestSubstringWithoutRepeatingChar ls=new LongestSubstringWithoutRepeatingChar();
        System.out.println(ls.lengthOfLongestSubstring("pwwkew"));

    }
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0,right=0;
        int maxLength=0;
        for(right=0;right<s.length();right++){
            char currentChar=s.charAt(right);

            while(set.contains(currentChar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLength=Math.max(maxLength,right-left+1);

        }
        return maxLength;
    }
}
