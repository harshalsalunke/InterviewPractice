package LeetCodeProblem;

import java.util.HashMap;

public class ValidAnagram {
    static void main(String[] args) {

       ValidAnagram validAnagram = new ValidAnagram();
       System.out.println(validAnagram.isAnagramUsingArray("anagram", "nagaram"));
    }

    //Method 1 : Using HashMap bit slow that Array bucket
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }
        return true;
    }
    //Method 2 : Using Array bucket
    public boolean isAnagramUsingArray(String s, String t){
        if(s.length() != t.length())
            return false;
        int count[]=new int[26];

        for(char ch : s.toCharArray()){
            int index=ch-'a';
            count[index]++;
        }
        for(char ch : t.toCharArray()){
            int index=ch-'a';
            if(count[index]==0)
                return false;
            count[index]--;
        }
        return true;
    }
}
