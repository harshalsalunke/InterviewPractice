package LeetCodeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagarms {
    /*
    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
    Example 1:
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public static void main(String[] args) {
        String[]  str={"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagarms groupAnagarms = new GroupAnagarms();
        groupAnagarms.groupAnagrams(str);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs)
        {
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedString=new String(charArray);

            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(str);

        }
        System.out.println(map.values());
        return new ArrayList<>(map.values());
    }


}
